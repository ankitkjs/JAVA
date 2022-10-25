import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

// for calling a servlet from a servlet there are two ways:
// 1)-> using  RequestDispatcher Interface
// 2)-> using sendRedirect() method


// In this project we will call a servlet from a servlet using RequestDispatcher way
// When a servlet is called from a servlet using RequestDispatcher way then client won't
// know that our request is dispatched from servlet-1 to servlet-2 because in address-bar 
// url will not change and also servlet-2 send's response to servlet-1 which in turn will 
// be given to client. So, client will not know that in backend servlet has called another
// servlet.


public class SubServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int diff = a-b;
		
		req.setAttribute("diff", diff);
		RequestDispatcher rd = req.getRequestDispatcher("cub");
		rd.forward(req, res);
	
	}

}
