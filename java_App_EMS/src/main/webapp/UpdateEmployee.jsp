<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMPLOYEE MANAGMENT SYSTEM</title>
<style>
.linear-gradient{
                           width: 1425px;
                           height: 700px;
                           background: linear-gradient(to top ,rgb(0, 64, 0),white,rgb(236, 84, 19));
                           box-shadow: 7px 7px 7px white, -7px -7px 7px white, 15px 15px 15px black;
                           margin: 20px;
                          }
</style>
</head>
<body class="linear-gradient">
<h2 align="center">
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("Page belongs to Admin :"+ab.getfName()+"<br>");
out.println(msg);
%>
</h2>
<br><a href="Employee.html">ADD EMPLOYEE</a><br>
<br><a href="view">VIEW ALL EMPLOYEES</a><br>
<br><a href="Logout">LOGOUT</a>
</body>
</html>