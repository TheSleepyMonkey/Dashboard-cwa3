package dashboard;

import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterDashBoardServlet extends HttpServlet  {


	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		List<Course> courses = new ArrayList<Course>();
		String[] allCourses = req.getParameterValues("courses");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String cpassword = req.getParameter("cpassword");
		String email = req.getParameter("email");
		
		if (allCourses != null) 
		   {
		      for (int i = 0; i < allCourses.length; i++) 
		      {
		         courses.add(new Course(allCourses[i]));
		      }
		   }
		
		if(username.length() != 0 && password.length() > 5 && cpassword.equals(password) && email.length() != 0)
		{
			
			resp.sendRedirect("dashboard.jsp?R=true");
		}
		else
		{
			resp.sendRedirect("register.jsp?R=false" );
		}
	}
}

