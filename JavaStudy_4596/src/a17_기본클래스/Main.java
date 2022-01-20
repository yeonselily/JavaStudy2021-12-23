package a17_기본클래스;

public class Main {

	public static void main(String[] args) {
		ObjectEx objectEx = new ObjectEx(); //heap memory 빌림 
		ObjectEx objectEx2 = new ObjectEx();
		ObjectEx objectEx3 = objectEx;
		objectEx.setUsername("seyeon");
		objectEx.setPassword("1234");
		objectEx2.setUsername("seyeon");
		objectEx2.setPassword("1234");
		System.out.println(objectEx.toString());
		System.out.println(objectEx.equals(objectEx2)); // == 주소 비교; 
													   // downcasting : true 
		
		System.out.println();
	}

}
