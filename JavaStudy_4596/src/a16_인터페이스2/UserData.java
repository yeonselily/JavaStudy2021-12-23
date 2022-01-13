package a16_인터페이스2;

public class UserData {
	private User[] userDataBase; 
	
	public UserData() {
		userDataBase = new User[5];
	}
	
	
	public User[] getUserDataBase() {
		return userDataBase;
	}


	public void setUserDataBase(User[] userDataBase) {
		this.userDataBase = userDataBase;
	}


	public void insertUsers() {
		userDataBase[0] = new User("aaaa", "1234", "박세연", "sandycindy56@naver.com");
		userDataBase[1] = new User("bbbb", "1234", "박세이", "sandycindy56@gmail.com");
		userDataBase[2] = new User("cccc", "1234", "박세삼", "sandycindy56@facebook.com");
		userDataBase[3] = new User("dddd", "1234", "박세사", "sandycindy56@kakao.com");
		userDataBase[4] = new User("eeee", "1234", "박세오", "sandycindy56@instagram.com");
	}
}
