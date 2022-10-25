import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


// 2nd method to send data from servlet-1 to servlet-2 when we use sendRedirect() method
// is to use cookies. Cookie is created on servlet-1 and sent to client from servlet-1 
// along with the data using response object.Now when client send's request to servlet-2 
// then along with request onject it also send's cookie to servlet-2.

// also note that in this DemoApp4 we have used Web-based Annoation for mapping servlets
// with their url's instead of using web.xml file

@WebServlet("/div")
public class DivServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		int divi = a/b;
		
		Cookie ck = new Cookie("divi",divi+"");
		res.addCookie(ck);
		res.sendRedirect("cub");

	}

}
