package a12_상속;

/*
 * 상속(Extends)
 * 부모, 자식 
 * 부모(100억, 차 3대, 아파트 3개)
 * 자식(변수 메소드를 쓸 수 있다) 
 * 
 * 자식이 존재하려면 부모가 먼저 존재해야한다. 
 * 
 * @ 는 어노테이션 
 * Override 어노테이션: 재정의 의미 
 */
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

public class ExtendsEx {

	public static void main(String[] args) {
		Animal a = new Animal();
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		a.move();
		h.move();
		h.readBook();
		t.move();
		t.hunting();
		e.move();
		e.flying();
		
		double d = 10; 
		int i = (int)10.1; 
		
		/*
		 * 업캐스팅, 다운캐스팅 
		 * 형 변환 
		 * 명시적 형 변환 
		 * 생성되지도 않는 객체로 다운캐스팅 불가능 
		 */
		Animal human = new Human(); 
		Human humanA = (Human)human; 
		//Tiger tigerA = (Tiger)human;
	
		Animal animal = new Animal(); 
		//Human humanA2 = (Human)animal;
		
		humanA.readBook();
		//humanA2.readBook();
		
	}

}
