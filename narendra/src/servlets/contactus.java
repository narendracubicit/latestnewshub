package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ContactDao;


@WebServlet("/contactus")
public class contactus extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String subject=request.getParameter("subject");
		String message=request.getParameter("message");
		int i=0;
		try {
			i=ContactDao.saveFeedback(name,email,subject,message);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(i>0)
		{
			response.sendRedirect("main.jsp");
		}
		else
		{
			response.sendRedirect("main.jsp");
		}
		
	}
	
	

}
