package dashboard;

import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterDashBoardServlet extends HttpServlet  {

	private RegisterController RC = new RegisterController();

	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		List<Course> courses = new ArrayList<Course>();
		String[] allCourses = req.getParameterValues("courses");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		
		RC.setInfo(username, password, email);
		
		if (allCourses != null) 
		   {
		      for (int i = 0; i < allCourses.length; i++) 
		      {
		       //  RC.addCourse(CourseRegistery.getInstance().getCourse());
		      }
		   }
		
		if(true)
		{
			
			resp.sendRedirect("dashboard.jsp?R=true");
		}
		else
		{
			resp.sendRedirect("register.jsp?R=false" );
		}
	}
}

