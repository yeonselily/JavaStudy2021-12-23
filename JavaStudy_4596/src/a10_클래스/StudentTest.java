package a10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(); 
		s1.name = "김준일";
		s1.addr = "부산진구";
		s1.phone = "01099881916";
		s1.studentYear = 3;
		
		Student s2 = new Student(); 
		s2.name = "김준이"; 
	    s2.addr = "동래구";
	    s2.phone = "01012345678";
	    s2.studentYear = 2; 
	    
	    s1.studentInfo();
	    s2.studentInfo();
	}

}
