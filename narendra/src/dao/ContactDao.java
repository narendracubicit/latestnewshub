package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactDao {

	public static int saveFeedback(String name, String email, String subject, String message) throws ClassNotFoundException, SQLException {
		
		Connection con=ConnectionClass.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into contactus(name,email,subject,message) values (?,?,?,?)");
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3, subject);
		pst.setString(4, message);
		
		int i=pst.executeUpdate();
		return i;
	}
	
	
	

}
