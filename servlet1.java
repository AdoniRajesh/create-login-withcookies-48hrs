package sessiontracking;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/firstaction")
public class servlet1 extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		if(req.getCookies()==null)
		{
			RequestDispatcher rd = req.getRequestDispatcher("loginpage.html");
			rd.forward(req, resp);
			
		}
		else
		{
			RequestDispatcher rd =req.getRequestDispatcher("welcomhome.html");
			rd.forward(req, resp);
		}
		
		
		
	}

}
