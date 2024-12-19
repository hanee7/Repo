package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/employeeLog")
public class EmployeeLoginServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
	String eid=req.getParameter("eid");
	EmployeeBean eb=new EmployeeLoginDAO().Login(eid);
	if (eb==null){
		req.setAttribute("msg","SESSION EXPIRED...<br>");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}else{
		HttpSession hs=req.getSession();
		hs.setAttribute("ebean",eb);
		req.getRequestDispatcher("EmployeeLoginSuccess.jsp").forward(req, res);
	}
}
}
