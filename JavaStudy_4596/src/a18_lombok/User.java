package a18_lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private String username;
	private String password;
	private String name;
	private String email; 
	
	
	//Student 
	//학생 이름, 학년, 반, 번호, 주소, 연락처, 생년월일 
	
	//기본생성자, 전체생성자, get, set, h, e, toString 
}
