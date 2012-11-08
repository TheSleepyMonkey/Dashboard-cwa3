package dashboard;

import javax.persistence.Id;

public class Course {
	
	private String coursename;
	private int semester;
	private String fase;
	
	@Id Long id;
	
	public Course(String coursename)
	{
		this.coursename = coursename;
	}
	
	public String getCoursename()
	{
		return coursename;
	}
	public long getId()
	{
		return id;
	}
}
