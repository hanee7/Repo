package test;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
ServletException,IOException{
	HttpSession hs=req.getSession(false);
	if (hs==null) {
		req.setAttribute("msg","Session Expired....<br>");
	}else {
		hs.removeAttribute("alist");
		hs.removeAttribute("abean");
		hs.invalidate();
		req.setAttribute("msg","<br> LOGED OUT SUCCESSFULLY....<br>");
	}//end of else
	req.getRequestDispatcher("Msg.jsp").forward(req,res);
}
}
