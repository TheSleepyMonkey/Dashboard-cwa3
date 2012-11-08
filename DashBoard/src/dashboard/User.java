package dashboard;

import java.util.*;

import javax.persistence.Id;

public class User {

	public enum Role {
		TUTOR, STUDENT;
	}

	@Id Long id;

	private String userName;
	private String password;
	private String email;

	private List<Course> courses;
	private List<Activity> activities;
	private List<String> favourites;
	private List<Milestone> milestones;

	private Role role = Role.STUDENT;

	public User(String username, String password, String email, List<Course> courses, String role)
	{
		this.userName = username;
		this.password = password;
		this.email = email;
		this.courses = courses;
		if(role.equals("Tutor"))
			this.role = Role.TUTOR;

		activities = new ArrayList<Activity>();
		milestones = new ArrayList<Milestone>();
		favourites =  new ArrayList<String>();
	}

	// Getters and setters

	public boolean setPassword(String password)
	{
		this.password = password;
		return true;
	}

	public List<String> getFavourites() {
		return favourites;
	}



	public List<Milestone> getMilestones() {
		return milestones;
	}


	public boolean setEmail(String email)
	{
		this.email = email;
		return true;
	}

	public String getUsername()
	{
		return userName;
	}

	public String getPassword()
	{
		return password;
	}

	public Role getRole()
	{
		return role;
	}

	public String getEmail()
	{
		return email;
	}

	public List<Course> getCourses()
	{
		return courses;
	}

	public List<Activity> getActivities()
	{
		return activities;
	}
	
	public long getId()
	{
		return id;
	}

	//adders and remover
	
	public boolean addCourse(Course course)
	{
		courses.add(course);
		return true;
	}

	public boolean removeCourse(String courseName)
	{
		if(courses.size() == 0) return false;
		for(Course course: courses)
		{
			if(course.getCoursename().equals(courseName))
			{
				courses.remove(course);
				return true;
			}
		}
		return false;
	}


	public void addActivity(Activity activity)
	{
		activities.add(activity);
	}

	public boolean removeActivity(int activityId)
	{
		if(activities.size() == 0) return false;
		for(Activity activity: activities)
		{
			if(activity.getId() == activityId)
			{
				activities.remove(activity);
				return true;
			}

		}
		return false;
	}
	
	public void addFavourite(String userNumber) {
		favourites.add(userNumber);
	}
	
	/**
	 * Verwijdert bepaalde user uit favorieten
	 * @param user : te verwijderen gebruiker uit favorieten
	 * @return true als gelukt, false als mislukt
	 */
	public boolean removeFavourite(int activityId)
	{
		if(favourites.size() == 0) return false;
		for(String userNumber: favourites)
		{
			if(favourites.contains(userNumber))
			{
				favourites.remove(userNumber);
				return true;
			}

		}
		return false;
	}

	public void addMilestone(Milestone milestone)
	{
		milestones.add(milestone);
	}
	
	public boolean removeMilestone(int milestoneId)
	{
		if(milestones.size() == 0) return false;
		for(Milestone milestone: milestones)
		{
			if(milestone.getId() == milestoneId)
			{
				milestones.remove(milestone);
				return true;
			}

		}
		return false;
	}

}
