package dashboard;

import java.util.ArrayList;
import java.util.List;
import com.googlecode.objectify.*;
public class UserRegistry {
	
	private static UserRegistry instance = null;
	private Objectify ofy = ObjectifyService.begin();
	
	public UserRegistry()
	{
	ObjectifyService.register(User.class);
	Iterable<User> keys =	ofy.query(User.class);
	}
	
	public static UserRegistry getInstance()
	{
		if(instance == null)
		{
			instance = new UserRegistry();
		}
		return instance;
	}
	
	public void addUser(User user)
	{
		ofy.put(user);
	}
		
	public User getUser(String userName)

	{
		return ofy.query(User.class).filter("username", userName).get();
	}
	
	public ArrayList<User> getAllUsers(){
	return null;
	}
	
	
}
