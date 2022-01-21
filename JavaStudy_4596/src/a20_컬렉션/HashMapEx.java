package a20_컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> category = new HashMap<String, String>();
		
		category.put("tumbler", "텀블러");
		category.put("mugcup", "머그컵");
		category.put("plate", "접시");
		category.put("spoon&chopsticks", "수저");
		category.put("pot", "냄비");
		
		String input = "mugcup"; 
		
		// if input == tumbler -> 텀블러 출력 
		if(input.equals("tumbler")) {
			System.out.println("텀블러");			
		}else if(input.equals("mugcup")) {
			System.out.println("머그컵");
		}else if(input.equals("plate")) {
			System.out.println("접시");
		}else if(input.equals("spoon&chopsticks")) {
			System.out.println("수저");
		}else if(input.equals("pot")) {
			System.out.println("냄비");
		}else {
			System.out.println("null");
		}
		
		String koStr = category.get(input);
		if(koStr == null) {
			System.out.println("지원하지 않는 값입니다.");
		}else {
			System.out.println(koStr);
		}
		
		PersonalUser personalUser = new PersonalUser(); 
		personalUser.setUsername("p_seyeon");
		personalUser.setPassword("123");
		personalUser.setPersonal_name("박세연");
		
		CompanyUser companyUser = new CompanyUser();
		companyUser.setUsername("c_seyeon"); 
		companyUser.setPassword("4321");
		companyUser.setCompany_name("세 세연회사"); 
		
		CompanyUser companyUser2 = new CompanyUser();
		companyUser2.setUsername("c_seyeon"); 
		companyUser2.setPassword("1234");
		companyUser2.setCompany_name("세 세연이회사"); 
		
		String username = "p_seyeon";
		String password = "123";  
		
		Map<String, User> userMap = new HashMap<String, User>();
		userMap.put(personalUser.getUsername(), personalUser);
		userMap.put(companyUser.getUsername(), companyUser); 
		userMap.put(companyUser2.getUsername(), companyUser2);
		
		System.out.println(userMap);
		
		User user = userMap.get(username); 
		if(user != null && user.getPassword().equals(password)) {
			if(user instanceof PersonalUser) {
				System.out.println((PersonalUser)user);
			}else {
				System.out.println((CompanyUser)user);
			}
		}else {
			System.out.println("존재하지 않는 계정이거나 비밀번호가 다릅니다.");
		}
		
		Set<String> set = userMap.keySet();
		
		Iterator<String> iterator = set.iterator(); 
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		userMap.remove("p_seyeon"); 
		
		
	}

}
