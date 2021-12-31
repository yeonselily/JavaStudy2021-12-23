package a12_상속;

public class Animal {
	private String kind = "동물"; 
	
	public Animal() {
		System.out.println("부모 객체 생성.");
	}
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}


