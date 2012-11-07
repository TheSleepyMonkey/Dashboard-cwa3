package dashboard;

import java.util.*;

public class User {
	
	public enum Role {
		TUTOR, STUDENT;
	}
	
	private int Id;
	private String username;
	private String password;
	private String email;
	private List<Integer> courses;
	private Role role = Role.STUDENT;
	
	public User(String username, String password, String email, List<Integer> courses, String role)
	{
		this.username = username;
		this.password = password;
		this.email = email;
		this.courses = courses;
		if(role.equals("Tutor"))
		this.role = Role.TUTOR;
	}

	public boolean setPassword(String password)
	{
		this.password = password;
		return true;
	}
	public boolean setEmail(String email)
	{
		this.email = email;
		return true;
	}
	public boolean addCourse(Integer courseId)
	{
		courses.add(courseId);
		return true;
	}
	public boolean removeCourse(String courseId)
	{
		if(courses.contains(courseId))
		{
			courses.remove(courseId);
			
		}
		return false;
	}
	
	public String getUsername()
	{
		return username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public String getRole()
	{
		return null;
	}
	public String getEmail()
	{
		return email;
	}
	public List<Integer> getCourses()
	{
		return courses;
	}
}
