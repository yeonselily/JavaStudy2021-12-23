package a19_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Message<T,E extends User> {
	private int code;
	private T data; 
	private E data2; 
	
}
