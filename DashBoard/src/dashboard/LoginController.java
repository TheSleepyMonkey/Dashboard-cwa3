package dashboard;

public class LoginController {


	public LoginController()
	{}
	
	public boolean checkUser(String username, String password)
	{
		if(UserRegistry.getInstance().getUser(username) != null && UserRegistry.getInstance().getUser(username).getPassword().equals(password))
			return true;
		return false;
	}
}
