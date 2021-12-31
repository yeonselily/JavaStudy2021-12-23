package a10_클래스2;

public class User {
	private String username; 
	private String password;
	private String name; 
	private String email; 
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password, String name, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void showUserInfo() {
		System.out.println("아이디: "+ username);
		System.out.println("비밀번호: "+ password);
		System.out.println("이름: "+ name);
		System.out.println("이메일: "+ email);
	}

}
