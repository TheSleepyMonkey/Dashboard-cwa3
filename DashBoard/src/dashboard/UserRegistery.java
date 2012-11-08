package dashboard;

import java.util.List;
import com.googlecode.objectify.*;
public class UserRegistery {
	
	private static UserRegistery instance = null;
	
	public UserRegistery()
	{
		ObjectifyService.register(com.google.appengine.api.users.User.class);
		int test = 0;
	}
	
	public UserRegistery getInstance()
	{
		if(instance == null)
		{
			instance = new UserRegistery();
		}
		return instance;
	}
	
	public void addUser(User u)
	{
		//toevoegen van user aan de database
	}
	
	public void removeUser()
	{
		//verwijderen van user van de database
	}
	
	public User getUser(String username)
	{
		return null;
	}
}
