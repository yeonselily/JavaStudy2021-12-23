package a19_제네릭;

public class GenericEx {
	
	public Message<?> sendMessage(int select) {
		if(select == 1) {
			PersonalUser personalUser = new PersonalUser("park se yeon"); 
			return new Message<PersonalUser>(10, personalUser); 
		}else if(select == 2) {
			CompanyUser companyUser = new CompanyUser("korea it"); 
			return new Message<CompanyUser>(20, companyUser); 
		}else {
			User user = new User("aaaa", "1234"); 
			return new Message<User>(0, user); 
		}
	}

	public static void main(String[] args) {
		//class에 메게변수 객체의 형태를 전달한다  <> 
		/*
		Message<String> strMessage = new Message<String>(); 
		strMessage.setCode(10);
		strMessage.setData("오류메세지입니다.");
		
		System.out.println("strMessage: " + strMessage); */
		
		
		User user = new User();
		user.setUsername("seyeon");
		user.setPassword("1234");
		
		Message<?> userMessage = new Message<User>(20, user);
		
		System.out.println("userMessage: " + userMessage);
		

	}

}
