package a10_클래스;

public class Student {
	String name; 
	int studentYear; 
	String addr;
	String phone; 
	
	void studentInfo() {
		System.out.println("이름: " + name);
		System.out.println("학년: " + studentYear);
		System.out.println("주소: "+ addr);
		System.out.println("전화번호:"+ phone);

	}
	
	public Student() {
		System.out.println("학생 만들어짐?");
	}
	
	//메소드 
	public void student() {
	}
}
