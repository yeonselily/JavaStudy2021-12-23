package a22_데이터베이스.Dto;

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
	private String addr; 
	
}
