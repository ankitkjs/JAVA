import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

// method-2 for calling a servlet from a servlet: sendRedirect() method
// in sendRedirect() method servlet-1 sends response to the client with sendRedirect("url")
// that go to servlet-2 which is mapped with this "url". So, url in address-bar changes
// to servlet-2's url and client would receive response from servlet-2

// when we have use sendRedirect() method for calling a servlet from a servlet,
// then there are two ways in which we can send data from servlet-1 to servlet-2
// method-1 using HttpSession inteface and method-2 using Cookies class
// in this demoapp3, we will send data from servlet to another servlet using HttpSession method.


public class MultServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int mult = a*b;
		
		HttpSession session = req.getSession();
		session.setAttribute("mult", mult);

		res.sendRedirect("sq");
		
	}
}
