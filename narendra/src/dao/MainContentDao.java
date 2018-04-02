package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.News;

public class MainContentDao {
	

	public static List<News> getAPNews() throws ClassNotFoundException, SQLException {
		
		List<News> apnews=new ArrayList<News>();
		
		Connection con=ConnectionClass.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from news where state=? and section not in(?) order by id desc");
		pst.setString(1, "ap");
		pst.setString(2, "student");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
		News news=new News();
		news.setDescription(rs.getString("description"));
		news.setUrl(rs.getString("url"));
		news.setFilepath(rs.getString("filepath"));
		
		
		apnews.add(news);
		
		}
		
		return apnews;
	}
	
	public static List<News> getCeeAcadenic() throws ClassNotFoundException, SQLException {
		
		List<News> cceacademic=new ArrayList<News>();
		
		Connection con=ConnectionClass.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from news where section=? order by id desc");
		pst.setString(1, "cceacademic");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
		News news=new News();
		news.setDescription(rs.getString("description"));
		news.setUrl(rs.getString("url"));
		news.setFilepath(rs.getString("filepath"));
		
		
		cceacademic.add(news);
		
		}
		
		return cceacademic;
	}
	public static List<News> getTsNews() throws ClassNotFoundException, SQLException {
		
		List<News> tsnews=new ArrayList<News>();
		
		Connection con=ConnectionClass.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from news where state=? and section not in(?) order by id desc");
		pst.setString(1, "ts");
		pst.setString(2, "student");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
		News news=new News();
		news.setDescription(rs.getString("description"));
		news.setUrl(rs.getString("url"));
		news.setFilepath(rs.getString("filepath"));
		
		
		tsnews.add(news);
		
		}
		
		return tsnews;
	}
	
	
	public static List<News> getGeneralNews() throws ClassNotFoundException, SQLException {
		
		List<News> GeneralNews=new ArrayList<News>();
		
		Connection con=ConnectionClass.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from news where section=? order by id desc");
		pst.setString(1, "generalnews");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
		News news=new News();
		news.setDescription(rs.getString("description"));
		news.setUrl(rs.getString("url"));
		news.setFilepath(rs.getString("filepath"));
		
		
		GeneralNews.add(news);
		
		}
		
		return GeneralNews;
	}
	
	
	public static List<News> getSoftwareNews() throws ClassNotFoundException, SQLException {
		
		List<News> GeneralNews=new ArrayList<News>();
		
		Connection con=ConnectionClass.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select * from news where section=? order by id desc");
		pst.setString(1, "softwarenews");
		
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
		News news=new News();
		news.setDescription(rs.getString("description"));
		news.setUrl(rs.getString("url"));
		news.setFilepath(rs.getString("filepath"));
		
		
		GeneralNews.add(news);
		
		}
		
		return GeneralNews;
	}
	

}
