<%@page import="java.io.OutputStream"%>
<%@page import="java.io.FileInputStream"%>
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
String filename=request.getParameter("filename");

String path=request.getRealPath("")+"\\uploads\\";

if(filename.contains(".txt"))
{
	response.setContentType("text/html");
}
else if(filename.contains(".jpg") || filename.contains(".jpeg"))
{
	response.setContentType("image/jpg");
}
else if(filename.contains(".docx"))
{
	response.setContentType("application/msword");
}
else if(filename.contains(".doc"))
{
	response.setContentType("application/msword");
}
else if(filename.contains(".pdf"))
{
	response.setContentType("application/pdf");
}
else
{
	response.setContentType("text/html");
}


FileInputStream fis=new FileInputStream(path+filename);
OutputStream ops=response.getOutputStream();
int i;

while((i=fis.read())!= -1)
{
ops.write(i);
}
ops.flush();
ops.close();
%>


</body>
</html>