package dashboard;

public class ActivityController {


	public ActivityController()
	{}
	
	public boolean checkActivity(long id) // Nog te doen!
	{
		if(CourseRegistry.getInstance().getCourse(id) != null)
			return true;
		return false;
	}
}