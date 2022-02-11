package a24_윈도우빌더.Service;

import java.util.HashMap;
import java.util.Map;

import a24_윈도우빌더.Dao.UserDao;
import a24_윈도우빌더.Dto.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao; 
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public Map<String, String> authLogin(String username, String password) {
		int loginResult = userDao.loginUserByUsernameAndPassword(username, password);
		
		Map<String, String> map = new HashMap<String, String>(); 

		if(loginResult == 2) {
			System.out.println("로그인 성공");
			map.put("title", "로그인 성공"); 
			map.put("content", "환영합니다.");
	
		}else if(loginResult == 1) {
			System.out.println("비밀번호가 일치하지 않음");
			map.put("title", "비밀번호 오류"); 
			map.put("content", "비밀번호가 일치하지 않습니다.\n다시 로그인 하세요."); 
		}else if(loginResult == 0) {
			System.out.println("존재하지 않는 아이디");
			map.put("title", "아이디 오류");
			map.put("content", "존재하지 않는 아이디입니다.\n 아이디를 확인해 주세요.");
		}else {
			System.out.println("DB서버 오류");
			map.put("title", "SQL Error"); 
			map.put("content", "DB서버에 문제가 있습니다.");
		}
		map.put("flag", Integer.toString(loginResult)); 
		return map;
	}
	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return userDao.getUserByUsername(username);
	}
}
