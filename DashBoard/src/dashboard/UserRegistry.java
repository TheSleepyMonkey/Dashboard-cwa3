package dashboard;

import java.util.List;
import com.googlecode.objectify.*;
public class UserRegistry {
	
	private static UserRegistry instance = null;
	
	public UserRegistry()
	{
		//ObjectifyService.register(User.class);
		int test = 0;
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
	
	public void removeUser()
	{
		//verwijderen van user van de database
	}
	
	public User getUser(String username)
	{
		return null;
	}
	
	public boolean isAuthenticated(User user)
	{
		if(getUser(user.getUsername()).getPassword().equals(user.getPassword()))
			return true;
		return false;
	}
}
