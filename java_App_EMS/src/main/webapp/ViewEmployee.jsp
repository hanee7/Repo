<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.*,java.util.*"%>
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
ArrayList<EmployeeBean> al=
(ArrayList<EmployeeBean>)session.getAttribute("alist");
out.println("page belong to admin : "+"<h2>"+ab.getfName()+"</h2>"+"<br>");

if(al.size()==0){
	out.println("NoEmployee Available...<br>");
}else{
	Iterator<EmployeeBean> it = al.iterator();
	while(it.hasNext()){
EmployeeBean eb=(EmployeeBean)it.next();
		
		out.println(eb.geteId()
				+"&nbsp&nbsp"+eb.geteName()
				+"&nbsp&nbsp"+eb.geteDesg()
				+"&nbsp&nbsp"+eb.geteCity()
				+"&nbsp&nbsp"+eb.getmId()
				+"&nbsp&nbsp"+eb.getPhNo()
				+"&nbsp&nbsp"+eb.getbSal()
				+"&nbsp&nbsp"+eb.getHra()
				+"&nbsp&nbsp"+eb.getDa()
				+"&nbsp&nbsp"+eb.getTotSal()+"<br>"
				+"&nbsp&nbsp"+"<a href='edit?eid="+eb.geteId()+"'>Edit</a>"+"<br>"
				+"&nbsp&nbsp"+"<a href='delete?eid="+eb.geteId()+"'>Delete</a>"+"<br>");
	
	}
}
%>
<h3><a href="Employee.html">ADD	 EMPLOYEE</a><br><br>
<a href="Logout">LOGOUT</a></h3>
</body>
</html>