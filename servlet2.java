package sessiontracking;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/secondaction")
public class servlet2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email =req.getParameter("email");
		String password =req.getParameter("password");
		
		Cookie cookie1=new Cookie("name", email);
		cookie1.setMaxAge(178200);
		Cookie cookie2=new Cookie("passcode", password);
		cookie2.setMaxAge(178200);
		
		resp.addCookie(cookie1);
		resp.addCookie(cookie2);
		
		RequestDispatcher rd =req.getRequestDispatcher("welcomhome.html");
		rd.forward(req, resp);
		
	}
       
}
