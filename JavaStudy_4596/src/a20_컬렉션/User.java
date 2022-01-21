package a20_컬렉션;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
	private String username;
	private String password;
	
}
@AllArgsConstructor
@NoArgsConstructor
@Data
class PersonalUser extends User{
	private String personal_name; 
}
@AllArgsConstructor
@NoArgsConstructor
@Data
class CompanyUser extends User {
	private String company_name;
}