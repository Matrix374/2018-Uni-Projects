package Servlet;
/*
 * Logs the user out and send them back home
 * 
 * @author Irfan_Hanafi
 * 
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HttpSession session;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		session = req.getSession();
		
		session.invalidate();
		
		resp.sendRedirect("home");
	}

}
