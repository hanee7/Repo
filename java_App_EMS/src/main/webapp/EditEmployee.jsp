<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.*"%>
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
<h1 align="center">
<%
AdminBean ab= (AdminBean)session.getAttribute("abean");
EmployeeBean eb=(EmployeeBean)request.getAttribute("ebean");
out.println("Page belongs to Admin :"+ab.getfName()+"<br>");
%></h1>
<form action="update" method="post"><br><br>
<br><input type="hidden" name="eid" value=<%=eb.geteId() %>>
DESG :<input type="text" name="edesg" value=<%=eb.geteDesg() %>>
CITY :<input type="text" name="ecity" value=<%=eb.geteCity() %>>
MAIL ID :<input type="text" name="mid" value=<%=eb.getmId() %>>
PHONE NO :<input type="text" name="phno" value=<%=eb.getPhNo() %>>
BASIC SALARY :<input type="text" name="bsal" value=<%=eb.getbSal() %>><br><br>
<input type="submit" value="UpdateEmployee">
</form>
</body>
</html>