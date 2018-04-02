<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AP GOs</title>
</head>
<body>

<%@ include file="apgosheader.html" %>
<h3 style="text-shadow:black; text-align: center; "><b>AP GOs</b></h3>
<jsp:include page="gosproceedings.jsp">
 <jsp:param value="gos" name="section"/>
</jsp:include>
</body>
</html>