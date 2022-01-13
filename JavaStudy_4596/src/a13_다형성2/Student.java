package a13_다형성2;
/*
 * 학생 
 * studentYear    학년
 * studentGroup   반 
 * studentNumber  번호 
 * 
 */
public class Student extends Person{
	
	private int studentYear;
	private int studntNumber;
	private int studentGroup;
	
	public int getStudentYear() {
	return studentYear;
	}


	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}


	public int getStudntNumber() {
		return studntNumber;
	}


	public void setStudntNumber(int studntNumber) {
		this.studntNumber = studntNumber;
	}


	public int getStudentGroup() {
		return studentGroup;
	}


	public void setStudentGroup(int studentGroup) {
		this.studentGroup = studentGroup;
	}


		
	
	
	public void study() {
		System.out.println( super.getName()+"학생이 공부를 합니다.");
		// 000학생이 공부를 합니다. 
	}

	
}
