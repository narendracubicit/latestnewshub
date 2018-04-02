package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.News;

public class LeavesDao {
	
	public static List<News> findLeaveRules() throws ClassNotFoundException, SQLException
	{
		List<News> list=new ArrayList<News>();
		Connection con=ConnectionClass.getConnection();
		PreparedStatement pst=null;
		
		pst=con.prepareStatement("select * from news where section=? order by id desc");
		pst.setString(1, "leaves");
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			News news=new News();
			news.setState(rs.getString("state"));
			news.setSection(rs.getString("section"));
			news.setSubSection(rs.getString("subsection"));
			news.setFilepath(rs.getString("filepath"));
			news.setDescription(rs.getString("description"));
			news.setUrl(rs.getString("url"));
			
			list.add(news);
		}		
		return list;
	}

}
