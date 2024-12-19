package test;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/eview")
public class EmployeeDetailsServlet extends HttpServlet
{@Override
protected void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
       HttpSession hs=req.getSession(false);
	if(hs==null) {
		req.setAttribute("msg","sesion expired..<br>");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
	}
	else
	{	
	EmployeeBean eb1=(EmployeeBean)hs.getAttribute("ebean");
    ArrayList<EmployeeBean> al=new EmployeeDetailsDAO().retrieve(eb1);
    hs.setAttribute("alist",al);
    req.getRequestDispatcher("EmployeeDetails.jsp").forward(req, res);
		}
}
}
