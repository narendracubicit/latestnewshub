package servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdminDao;

@WebServlet("/adminlogin")
public class AdminLogin extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		try {
			
			boolean isAdmin=AdminDao.login(username,password);
			if(isAdmin)
			{
				response.sendRedirect("uploadnews.jsp");
			}
			else
			{
				response.sendRedirect("adminlogin.html");
			}
			
		} catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
