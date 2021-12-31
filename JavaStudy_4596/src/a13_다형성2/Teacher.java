package a13_다형성2;
/*
 * 선생님
 * subject    과목 
 * classYear  담임 학년 
 * classGroup 담임 반 
 *   
 */
public class Teacher extends Person{
	private String subject;
	private int classYear;
	private int classGroup;
	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getClassYear() {
		return classYear;
	}

	public void setClassYear(int classYear) {
		this.classYear = classYear;
	}

	public int getClassGroup() {
		return classGroup;
	}

	public void setClassGroup(int classGroup) {
		this.classGroup = classGroup;
	}

	public void studyClass() {
		System.out.println( + "선생님이 수업을 합니다.");
		// 000 선생님이 수업을 합니다. 
	}

	// 사람의 showInfo 메소드 오버라이딩 후 선생님정보 출력 
	
	public void showInfo();
	
	
}
