package dashboard;

public class LoginController {

	
	public LoginController()
	{}
	
	public boolean checkUser(String username, String password)
	{
		if(UserRegistery.getInstance().getUser(username) != null && UserRegistery.getInstance().getUser(username).getPassword().equals(password))
			return true;
		return false;
	}
}
