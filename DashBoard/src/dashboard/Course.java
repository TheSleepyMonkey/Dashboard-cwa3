package dashboard;

public class Course {
	
	private String coursename;
	private int semester;
	private String fase;
	private int Id;
	
	public Course(String coursename)
	{
		this.coursename = coursename;
	}
	
	public String getCoursename()
	{
		return coursename;
	}
	public String getIdToString()
	{
		return "" + Id;
	}
}
