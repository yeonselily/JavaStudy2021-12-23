package a17_기본클래스;

import java.util.Objects;

public class ObjectEx extends Object{
	private String username;
	private String password; 
	
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

	@Override
	public String toString() {
		return "ObjectEx [username=" + username + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}  //클래스와 코드가 같은지 검사 

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectEx other = (ObjectEx) obj;
		return Objects.equals(username, other.username);  //외부드ㄹ어온 오브젝트 같은지 
	}
	
	
	
	

}
