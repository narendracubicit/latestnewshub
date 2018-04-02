package servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.News;
import dao.ConnectionClass;

@WebServlet("/uploadnews")
public class UploadNews extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	
	{	
		String filename=null;
		News s=new News();

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		boolean isMultipart=ServletFileUpload.isMultipartContent(request);

		if(isMultipart)
		{
			
		DiskFileItemFactory disfact=new DiskFileItemFactory();

		ServletFileUpload upload=new ServletFileUpload(disfact);

		List<FileItem> files = null;
		try
		{
		
		files = upload.parseRequest(request);
		}
		catch (FileUploadException e)
		{
		e.printStackTrace();
		}

		for(FileItem item:files)
		{

		if(item.isFormField())
		{
		String name=item.getFieldName();
		String value=item.getString();

		if(name.equals("state"))
		{
		s.setState(value);
		}
		else if(name.equals("section"))
		{
		s.setSection(value);
		}
		else if(name.equals("subsection"))
		{
		s.setSubSection(value);
		}
		else if(name.equals("url"))
		{
		s.setUrl(value.replace(" ", "-"));
		}
		else if(name.equals("description"))
		{
		s.setDescription(value);
		}
		}

		else
		{
	
			if(item.getSize()==0 || item.getName()==null)
			{
				filename="";
				s.setFilepath(filename);
			}
			else
			{
		filename=item.getName(); // actual file name
		filename=(s.getUrl())+(filename.substring(filename.indexOf(".")));

		s.setFilepath(filename);

		try 
		{
	    String UPLOAD_DIRECTORY = request.getRealPath("") + "\\uploads\\";
	    // D:\Narendra\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\narendra\\uploads\
	    
		item.write(new File(UPLOAD_DIRECTORY+File.separator+filename));
		}
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		}
		}
		}
		
		try
		{
			
		Connection con=ConnectionClass.getConnection();

		PreparedStatement pst=con.prepareStatement("insert into news(state,section,subsection,url,filepath,description) values(?,?,?,?,?,?)");

		pst.setString(1, s.getState());
		pst.setString(2, s.getSection());
		pst.setString(3, s.getSubSection());
		pst.setString(4, s.getUrl());
		pst.setString(5, s.getFilepath());
		pst.setString(6, s.getDescription());

		pst.executeUpdate();
		}
		catch(Exception e)
		{
		out.print(e);
		}
		}
		response.sendRedirect("uploadnews.jsp");

	}

}
