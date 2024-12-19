package test;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewEmployeeServlet extends HttpServlet
{
  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
  ServletException,IOException
  {
	HttpSession hs=req.getSession(false);
	if(hs==null)
			{
		      req.setAttribute("msg","session expired...<br>");
		      req.getRequestDispatcher("Msg.jsp").forward(req, res);
			}
	else {
		ArrayList<EmployeeBean> al=new ViewEmployeeDAO().retrieve();
		hs.setAttribute("alist",al);
		req.getRequestDispatcher("ViewEmployee.jsp").forward(req, res);
	}
  }
}
