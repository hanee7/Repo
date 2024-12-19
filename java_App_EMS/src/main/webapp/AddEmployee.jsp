<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<%
AdminBean ab=(AdminBean)session.getAttribute("abean");
String msg=(String)request.getAttribute("msg");
out.println("Page Belongs To :"+ab.getfName()+"<br>");
out.println(msg);
%>
<br><br><a href="Employee.html">Add Employee</a><br><br>
<a href="view">View All Employees</a><br><br>
<a href="Logout">Logout</a>

</body>
</html>