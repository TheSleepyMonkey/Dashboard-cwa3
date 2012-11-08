package dashboard;

import java.util.List;
import com.googlecode.objectify.*;
public class UserRegistry {
	
	private static UserRegistry instance = null;
	
	public UserRegistry()
	{

	}
	
	public static UserRegistry getInstance()
	{
		if(instance == null)
		{
			instance = new UserRegistry();
		}
		return instance;
	}
	
	public void addUser(User u)
	{
		//toevoegen van user aan de database
	}
	
	
	public void getInstance(){
		
	}
	public User getUser(String username)
	{
		return null;
	}
	
	
}
