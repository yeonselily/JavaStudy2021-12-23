package a21_스태틱;

import lombok.Data;

@Data
public class Apple {
	public static Apple instance = new Apple();  //싱글톤 instance, getInstance()
	
	private int product_code;
	
	
	private Apple() {
		
	}
	
	public static Apple getInstance() {
		if(instance == null) {
			instance = new Apple();  // 꼭 있어야 함 
		}
		return instance;
	}
	
	public AppleProduct createProduct(String product_name, String version) {
		AppleProduct appleProduct = new AppleProduct(++product_code, product_name, version);
		return appleProduct; 
	}
	
}
