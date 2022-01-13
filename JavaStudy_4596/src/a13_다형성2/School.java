package a13_다형성2;

public class School {
	public static void main(String[] args) {
		
		//service 생성 후 배열 설정 
		SchoolService schoolService = new SchoolService();
		Person[] persons = schoolService.setPersonArray();
		

		//모든 배열에 학생 및 선생님 정보 등록 
		schoolService.insertPerson(persons);
		
		//모든 배열의 학생 및 선생님 정보 출력 
		//학생이면 학생정보, study()
		//선생님이면 선생님정보, studyClass()
		schoolService.showInfoPerson(persons);
	}
	
}
