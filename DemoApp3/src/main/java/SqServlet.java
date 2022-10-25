import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class SqServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		HttpSession session=req.getSession();
		int k = (int)session.getAttribute("mult");
		
		PrintWriter out = res.getWriter();
		out.println("Square of "+k+" is: "+(k*k));
	}
}
