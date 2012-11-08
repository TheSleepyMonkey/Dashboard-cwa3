package dashboard;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.apphosting.utils.remoteapi.RemoteApiPb.Request;

public class LoginDashBoardServlet extends HttpServlet {
	
	private LoginController LC;
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
    
	LC = new LoginController();
    String username = req.getParameter("username");
    String password = req.getParameter("password");
    
    HttpSession session = req.getSession();
   
    
    
    String url="login.jsp"; //relative url for display jsp page
    
    session.setAttribute("Lusername", username);
    req.setAttribute("username", username);
    
    if(LC.checkUser(username, password))
    {
    	//session.setAttribute("user", UserRegistery.getInstance().getUser(username));
    	resp.sendRedirect("dashboard.jsp?l=true");
	}
    else
    {	
    	resp.sendRedirect("login.jsp?l=false");
    }
	}
}
