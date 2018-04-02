package servlets;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class test extends HttpServlet {
	
	public void doGet(HttpServletRequest request,HttpServletResponse response)
	 
	{
		
		   String UPLOAD_DIRECTORY = request.getRealPath("") + "\\uploads\\";
		   System.out.println(UPLOAD_DIRECTORY);
		   
		   String Path= request.getContextPath();
		   System.out.println(Path);
		   
		   String 	Path1 = request.getRealPath(".");
		   System.out.println(Path1);
	}

}
