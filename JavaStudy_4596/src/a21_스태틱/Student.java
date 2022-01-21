package a21_스태틱;

import lombok.Data;

@Data
public class Student {
	public static String name;
	public static String phone; 

	public static void studentInfo() {
		System.out.println(name);
		System.out.println(phone);
		
	}
}
