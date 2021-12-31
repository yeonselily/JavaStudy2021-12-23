package a13_다형성;

class Human extends Animal {
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	@Override
	public void move() {
		System.out.println("사람이 두발로 걷습니다.");
	}
}
class Tiger extends Animal {
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뛰어다닙니다.");
	}
}
class Eagle extends Animal {
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아다닙니다.");
	}
	
	@Override
	public void move() {
		System.out.println("독수리가 날아다닙니다.");
	}		
	
}

public class Animal {
	private String kind = "동물"; 
	
	public Animal() {
		System.out.println("부모 객체 생성.");
	}
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}


