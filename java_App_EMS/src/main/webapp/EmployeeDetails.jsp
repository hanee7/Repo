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
EmployeeBean eb1=(EmployeeBean)session.getAttribute("ebean");
out.println("Page belongs to employee : "+eb1.geteName()+"<br>"+
            "EMPLOYEE ID :"+eb1.geteId()+"<br>"+
            "EMPLOYEE NAME :"+eb1.geteName()+"<br>"+
            "EMPLOYEE DESG :"+eb1.geteDesg()+"<br>"+
            "EMPLOYEE CITY :"+eb1.geteCity()+"<br>"+
            "EMPLOYEE MAILID :"+eb1.getmId()+"<br>"+
            "EMPLOYEE PHONNO :"+eb1.getPhNo()+"<br>"+
            "EMPLOYEE BSAL :"+eb1.getbSal()+"<br>"+
            "EMPLOYEE HRA :"+eb1.getHra()+"<br>"+
            "EMPLOYEE DA :"+eb1.getDa()+"<br>"+
            "EMPLOYEE TOTSAL :"+eb1.getTotSal()+"<br>");
		
%>
<a href="Logout">Logout</a>
</body>
</html>