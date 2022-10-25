import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

public class CubeServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int k = (int) req.getAttribute("diff");
		int cube = k*k*k;
		PrintWriter out = res.getWriter(); 
		out.println("Cube of "+k+" is: "+cube);
	}
}
