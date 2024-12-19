<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.AdminBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EMPLOYEE MANAGEMENT SYSTEM</title>
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
<h1 align="center">
  <%AdminBean ab=(AdminBean)session.getAttribute("abean");
  out.println("WELCOME ADMIN : "+ab.getfName()+"<br>");
  %>
</h1>
  <h2 align="left">
   <a href="Employee.html">ADD NEW EMPLOYEE</a><br>
   <a href="view">VIEW ALL EMPLOYEES</a><br>
   <a href="Logout">LOG OUT</a></h2>
</body>
</html>