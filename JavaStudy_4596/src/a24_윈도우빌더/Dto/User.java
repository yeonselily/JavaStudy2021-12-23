package a24_윈도우빌더.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private int user_code;
	private String username; 
	private String password; 
	private String name; 
	private String email; 
	private String phone;
	private String address; 

}
