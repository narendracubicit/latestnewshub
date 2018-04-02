package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.News;

public class NewsDao {

	public static List<News> findFormDetails(String listname) throws ClassNotFoundException, SQLException {
		/**
		 * data from & to formslist.jsp 
		 * (Employee)forms-- gpf,gis,it,ltc,zpff
			gos--promotions,womenteacher,scstcommunity
			proceedings-- womenteacher
			leaves-- paternityleave, earnedleave
			student-- result,notifications,halltickets,timetable

		 */
		System.out.println(listname);
		String Section=null;
		String SubSection=null;
		
		List<News> list=new ArrayList<News>();
		Connection con=ConnectionClass.getConnection();
		PreparedStatement pst=null;

		if(listname.equals("allforms"))
		{
			/**
			 * we are taking section as forms so all subsections will be fetched
			 */
			pst=con.prepareStatement("select * from news where section=? order by id desc");
			pst.setString(1, "forms");		
		}
		else
		{
			/**
			 *  remaining subsections like Gpf,IT,Ltc etc.
			 */
			
			pst=con.prepareStatement("select * from news where subsection=? order by id desc");
			pst.setString(1, listname);		
		}
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

	public static List<News> findGoAndProceedingsDetails(String sectionname) throws ClassNotFoundException, SQLException {
			/**
			 *  data from gosproceedings.jsp  page ..in ap state
			 */
		List<News> list=new ArrayList<News>();
		Connection con=ConnectionClass.getConnection();
		PreparedStatement pst=null;
		
		pst=con.prepareStatement("select * from news where state=? and section=? order by id desc");
		pst.setString(1, "ap");	
		pst.setString(2, sectionname);	
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


	public static List<News> findGOsSubSectionDetails(String subsectionname) throws ClassNotFoundException, SQLException {
		/**
		 *  data from gos-subsection-list.jsp  page .. ap state
		 */
	List<News> list=new ArrayList<News>();
	Connection con=ConnectionClass.getConnection();
	PreparedStatement pst=null;
	
	pst=con.prepareStatement("select * from news where state=? and subsection=? order by id desc");
	pst.setString(1, "ap");
	pst.setString(2, subsectionname);
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
