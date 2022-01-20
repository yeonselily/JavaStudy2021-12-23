package a18_lombok;

import a18_lombok.Student.StudentBuilder;

public class Main {

	public static void main(String[] args) {
		User user = new User("seyeon", "1234","박세연","gmail.com");
		User user2 = new User("seyeon", "1234","박세연","gmail.com");
		
		System.out.println(user);
		System.out.println(user2);
		
		System.out.println(user.equals(user2));

		Student s = Student.builder().이름("박세연").학년("1").반("2").번호("3").build();
		System.out.println(s);
	}

}
