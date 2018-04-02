package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SecSubSectionDao {

	public static List<String> getSections() throws ClassNotFoundException, SQLException 
	{
	
		List<String> sectionnames=new ArrayList<String>();
		Connection con= ConnectionClass.getConnection();
		PreparedStatement pst=con.prepareStatement("select distinct section from sectionsubsection");
		
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			sectionnames.add(rs.getString("section"));
		}
	
		return sectionnames;
	}
	public static List<String> getSubSections() throws ClassNotFoundException, SQLException  
	{
		List<String> subsectionnames=new ArrayList<String>();
		Connection con= ConnectionClass.getConnection();
		PreparedStatement pst=con.prepareStatement("select subsection from sectionsubsection where section=?");
		pst.setString(1, "");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			subsectionnames.add(rs.getString("subsection"));
		}
		return subsectionnames;
	}

}
