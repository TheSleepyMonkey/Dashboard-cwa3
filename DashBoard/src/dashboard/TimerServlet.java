package dashboard;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TimerServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		if(req.getParameter("start")!=null){
			startTiming(req,resp);
		}

		else if (req.getParameter("stop")!= null){
			if(isTiming(req)==true){
				stopTiming(req,resp);
			}
			else{
				resp.sendRedirect("timer.jsp");
			}
		}

	}



	private long getTimeLapse(Date date){
		Date now = new Date();
		long timeLapseMs = now.getTime() - date.getTime();
		long timeLapseS = timeLapseMs/1000;
		return timeLapseS;

	}

	public void startTiming(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		if (isTiming(req)){
			resp.sendRedirect("timer.jsp?t=started");
		}
		else{
			String type= req.getParameter("type");
			String courseName = req.getParameter("vak");
			int courseId = CourseRegistry.getInstance().getCourseId(courseName);
			Date now = new Date();

			HttpSession session = req.getSession();	
			User currentUser =  (User) session.getAttribute("user");
			currentUser.addActivity(type, now, courseId);

			session.setAttribute("timerInProgress", true );
			session.setAttribute("timerCourse" ,courseName);
			session.setAttribute("time", 0);
			session.setAttribute("type", type);
			resp.sendRedirect("timer.jsp?t=started");
		}

	}

	public void stopTiming(HttpServletRequest req, HttpServletResponse resp) throws IOException{

		HttpSession session = req.getSession();	
		User currentUser =  (User) session.getAttribute("user");

		int appreciation = Integer.parseInt(req.getParameter("appreciaton"));
		int nrOfPages = Integer.parseInt(req.getParameter("nrOfPages"));
		Date stop= new Date();
		String location = req.getParameter("location");
		List<Activity> activities =   currentUser.getActivities();
		Activity activity = activities.get(activities.size() - 1);

		activity.setAppreciation(appreciation);
		activity.setNrOfPages(nrOfPages);
		activity.setPlace(location);
		activity.setStop(stop);
		Date start = activity.getStart();
		currentUser.setTiming(false);
		long time=getTimeLapse(start);

		session.removeAttribute("timerInProgress");
		session.removeAttribute("timerType");
		session.removeAttribute("time");
		session.removeAttribute("timerCourse");

		resp.sendRedirect("timer.jsp?t=stopped&time="+time);
	}

	public boolean isTiming(HttpServletRequest req){
		HttpSession session = req.getSession();	
		User currentUser =  (User) session.getAttribute("user");

		if(currentUser.isTiming()==false){
			return false;
		}
		else{ 
			List<Activity> activities =   currentUser.getActivities();
			Activity activity = activities.get(activities.size() - 1);

			session.setAttribute("timerInProgress", true );
			session.setAttribute("timerCourse" ,CourseRegistry.getInstance().getCourseName(activity.getCourseId()));
			session.setAttribute("time", getTimeLapse(activity.getStart()));
			session.setAttribute("timerType", activity.getType());
			return true;
		}
	}

}