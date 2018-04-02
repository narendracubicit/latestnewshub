package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import bean.News;

public class ConnectionClass {
	
 public static Connection getConnection() throws ClassNotFoundException, SQLException
 {
	 
	 Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","narendra","narendra"); 

	 
	return con;
	
 }


}
