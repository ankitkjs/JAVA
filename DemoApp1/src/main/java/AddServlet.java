import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

// in "index.html" file we take two numbers as input and when we hit submit then request goes
// to "/add" url which is mapped to "AddServlet" class using "web.xml" deployment descriptor file.
// in "AddServlet" class we accept those two parameters, add them and then display their result
// on web browser with the help of response object.

public class AddServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int sum = a+b;
	
		PrintWriter out = res.getWriter();
		out.println("sum of "+a+" & "+b+" is: "+sum);
	}
}
