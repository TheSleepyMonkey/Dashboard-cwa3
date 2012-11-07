package dashboard;
import java.io.IOException;

import javax.servlet.http.*;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class LoginDashBoardServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
    
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    
    HttpSession session = req.getSession();
    
    
    
    if(username.length() != 0 && password.length() > 5)
    {
    	session.setAttribute("username", username);
        session.setAttribute("password", password);
    	resp.sendRedirect("dashboard.jsp?l=true");
	}
    else
    {
    	resp.sendRedirect("login.jsp?l=false");
    }
	}
}
