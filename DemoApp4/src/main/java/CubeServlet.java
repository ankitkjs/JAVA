import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/cub")
public class CubeServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		
		int k=0;
		Cookie ck[] = req.getCookies();
		
		for(Cookie c:ck)
		{
			if(c.getName().equals("divi"))
			{
				k= Integer.parseInt(c.getValue());
			}
		}
		
		PrintWriter out = res.getWriter();
		out.println("Cube of "+k+" is: "+(k*k*k));
		
	}

}
