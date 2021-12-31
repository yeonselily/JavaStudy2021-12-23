package a10_클래스2;

public class UserController {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		User[] users = userService.setUserArray();
		
		userService.insertUser(users);
		userService.showUsersInfo(users);

	}

}
