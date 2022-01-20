package a18_lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Builder //new 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Student {
	private String 이름;
	private String 학년;
	private String 반;
	private String 번호;
	private String 주소;
	private String 연락처;
	
	/*학생 이름, 학년, 반, 번호, 주소, 연락처, 생년월일 
	
	기본생성자, 전체생성자, get, set, h, e, toString */


}
