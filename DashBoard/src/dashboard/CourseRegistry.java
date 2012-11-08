package dashboard;

import java.util.List;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class CourseRegistry {
	
	private static CourseRegistry instance = null;
	private List<Course> courses;
	private Objectify ofy = ObjectifyService.begin();
	
	public CourseRegistry()
	{
	ObjectifyService.register(Course.class);
	Iterable<Course> keys =	ofy.query(Course.class);
		
	}
	
	public static CourseRegistry getInstance()
	{
		if(instance == null)
		{
			instance = new CourseRegistry();
		}
		return instance;
	}
	
	public void addCourse(Course course)
	{
		ofy.put(course);
	}
	
	public void removeCourse(String course) // Geen idee of dit string of course moet zijn van type
	{
		ofy.delete(course);
	}
	
	public List<Course> getCourses() //Nog doen
	{
		return courses;
	}
	
	public Course getCourse(long id) // Nog doen
	{	
		return ofy.query(Course.class).filter("id", id).get();	
	}
}
