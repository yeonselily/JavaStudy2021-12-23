package a17_기본클래스;

public class UserTest {

	public static void main(String[] args) {
		User user = new User();
		user.setUsername("seyeon");
		user.setPassword("1234");
		
		User dbUser = new User();
		dbUser.setUsername("seyeon");
		dbUser.setPassword("1234");
		
		System.out.println(user.equals(dbUser));

	}

}
