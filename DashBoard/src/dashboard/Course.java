package dashboard;

import javax.persistence.Id;

public class Course {
	
	private String coursename;
	private int semester;
	private String fase;
	
	@Id Long id;
	public Course(String coursename, int semester, String fase)
	{
		this.coursename = coursename;
		this.semester = semester;
		this.fase = fase;
	}
	
	public String getCoursename()
	{
		return coursename;
	}
	
	public long getId()
	{
		return id;
	}
	
	public long getSemester()
	{
		return semester;
	}
	
	public long getFase()
	{
		return fase;
	}
}
