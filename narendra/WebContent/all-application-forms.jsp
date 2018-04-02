<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ALL APPLICATION FORMS</title>
</head>
<body>

<%@ include file="employeeheader.html" %>
<h3 style="text-shadow:black; text-align: center; "><b>All Application Forms</b></h3>

<jsp:include page="formslist.jsp">
 <jsp:param value="allforms" name="nameoflist"/>
</jsp:include>

</body>
</html>