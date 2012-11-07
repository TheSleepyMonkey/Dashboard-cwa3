package dashboard;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutDashBoardServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		HttpSession session = req.getSession();
		session.setAttribute("username", null);
		resp.sendRedirect("dashboard.jsp");

	}
}
