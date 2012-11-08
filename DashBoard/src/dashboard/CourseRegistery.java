package dashboard;

import java.util.List;

public class CourseRegistery {
	
	private static CourseRegistery instance = null;
	private List<Course> courses;
	
	public CourseRegistery()
	{
		
		
	}
	
	public CourseRegistery getInstance()
	{
		if(instance == null)
		{
			instance = new CourseRegistery();
		}
		return instance;
	}
	
	public void addCourse(Course c)
	{
		//toevoegen van user aan de database
	}
	
	public void removeCourse(String course)
	{
		//verwijderen van user van de database
	}
	
	public List<Course> getCourses()
	{
		return courses;
	}
}
