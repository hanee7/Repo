<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.EmployeeBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
EmployeeBean eb=(EmployeeBean)session.getAttribute("ebean");
out.println("page belongs to employee : "+eb.geteName()+"<br>");
%>
<a href="eview">VIEW DETAILS</a>
<a href="Logout">LOGOUT</a>
</body>
</html>