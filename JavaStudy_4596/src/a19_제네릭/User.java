package a19_제네릭;

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
	private String psersonal_name; 
}
@AllArgsConstructor
@NoArgsConstructor
@Data
class CompanyUser extends User {
	private String company_name;
}