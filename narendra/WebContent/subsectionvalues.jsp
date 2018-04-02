<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="dao.ConnectionClass"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%  
String section=request.getParameter("section");  
if(section==null)
{  
out.print("Please select");  
}
else
{  
 
try
{  
	Connection con=ConnectionClass.getConnection();

	PreparedStatement pst=con.prepareStatement("select subsection from sectionsubsection where section=?");  
	pst.setString(1,section);  
	ResultSet rs=pst.executeQuery();  

while(rs.next())
{ 
%>
<option value="<%=rs.getString("subsection")%>"><%=rs.getString("subsection") %></option>
<%
}
%>
 <% 
con.close();  
}catch(Exception e){e.printStackTrace();}  
}  
%>  


</body>
</html>