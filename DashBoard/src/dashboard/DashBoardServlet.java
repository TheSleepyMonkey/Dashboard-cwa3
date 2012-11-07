package dashboard;


import java.io.IOException;
import javax.servlet.http.*;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class DashBoardServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
              throws IOException {

    	HttpSession session1 = req.getSession();
    	
        if (session1.getAttribute("username") != null) {
            resp.setContentType("text/plain");
            resp.getWriter().println("Weclome to dashboard, " + session1.getAttribute("username") );
        } else {
            resp.sendRedirect("login.jsp");
        }
    }
}
