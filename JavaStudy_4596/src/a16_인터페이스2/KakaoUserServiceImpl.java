package a16_인터페이스2;

import java.util.Scanner;

public class KakaoUserServiceImpl implements UserService{
	private Scanner scanner; 
	private UserData userData;
	private User[] users;
	
	public KakaoUserServiceImpl() {
		scanner = new Scanner(System.in);
		userData = new UserData();
		userData.insertUsers(); 
		users = userData.getUserDataBase(); 
	}
	
	@Override
	public User getUser() {
		String username = null; 
		System.out.println("[Kakao 사용자 검색]");
		System.out.print("아이디: ");
		username = scanner.nextLine(); 
		for(User user : users) {
			if(user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public boolean addUser() {
		return false;
	}

	@Override
	public boolean removeUser() {
		return false;
	}
	


}
