package a24_윈도우빌더.Service;

import java.util.Map;

import a24_윈도우빌더.Dto.User;


public interface UserService {
	public Map<String, String> authLogin(String username, String password); 
	public User getUser(String username);  
}
