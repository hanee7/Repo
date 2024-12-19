package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet {
protected void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException
{
	HttpSession hs=req.getSession(false);
	if (hs==null) {
		req.setAttribute("msg","session expried..<br>");
		req.getRequestDispatcher("Msg.jsp").forward(req,res);
	}else {
		EmployeeBean eb=new EmployeeBean();
		eb.seteId(req.getParameter("eid"));
		eb.seteName(req.getParameter("ename"));
		eb.seteDesg(req.getParameter("edesg"));
		eb.seteCity(req.getParameter("ecity"));
		eb.setmId(req.getParameter("mid"));
		eb.setPhNo(Long.parseLong(req.getParameter("phno")));
		int bSal=Integer.parseInt(req.getParameter("bsal"));
		float hra=0.91F*bSal;
		float da=0.63F*bSal;
		float totsal=bSal+hra+da;
		eb.setbSal(bSal);
		eb.setHra(hra);
		eb.setDa(da);
		eb.setTotSal(totsal);
		int k=new AddEmployeeDAO().insert(eb);
		if(k>0) {
			req.setAttribute("msg", "Employee Added Successfully.....<br>");
			req.getRequestDispatcher("AddEmployee.jsp").forward(req,res);
		}
	}
	}
}
