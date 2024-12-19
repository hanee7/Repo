package test;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteEmployeeServlet extends HttpServlet
{@SuppressWarnings("unchecked")
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws 
ServletException,IOException{
	HttpSession hs=req.getSession(false);
	if(hs==null) {
		req.setAttribute("msg","session expired...<br>");
		req.getRequestDispatcher("Msg.jsp").forward(req, res);
		
	   }else {
		ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)hs.getAttribute("alist");
		String eId=req.getParameter("eid");
		System.out.println(eId);
		
		Iterator<EmployeeBean> it=al.iterator();
		while(it.hasNext()) 
		{
			EmployeeBean eb=(EmployeeBean)it.next();
			if(eId.equals(eb.geteId())) 
			{
				int k=new DeleteEmployeeDAO().Delete(eb);
				if(k>0)
				{
					req.setAttribute("msg", "employee deleted successfully...<br>");
					req.getRequestDispatcher("DeleteEmployee.jsp").forward(req, res);
				}
				break;
			}
		}
	}
	}
}
