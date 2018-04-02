package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDao {

	public static boolean login(String username, String password) throws ClassNotFoundException, SQLException {
	
		Connection con=ConnectionClass.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from admin where username=? and password=?");
		
		pst.setString(1, username);
		pst.setString(2, password);
		
		ResultSet rs=pst.executeQuery();
		boolean isAdmin=false;
		if(rs.next())
		{
			isAdmin=true;
		}
		
		return isAdmin;
	}

}
