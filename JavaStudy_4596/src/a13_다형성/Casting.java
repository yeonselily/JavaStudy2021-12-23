package a13_다형성;
//다향한 형태로 변환이 된다. 
public class Casting {

	public static void main(String[] args) {
		Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		//배열 - 반복적 작업 쉽게 처리 
		Animal[] animals = new Animal[10]; 
		
		animals[0] = human;
		animals[1] = tiger;
		animals[2] = human;
		animals[3] = eagle;
		animals[4] = tiger;
		animals[5] = eagle;
		animals[6] = eagle;
		animals[7] = human;
		animals[8] = eagle;
		animals[9] = tiger;
		
		System.out.println(animals[0] instanceof Human);
		
		for(int i = 0; i < animals.length; i++) {
			animals[i].move(); 
		}
		
		for(int i=0; i < animals.length; i++) {
			if(animals[i] instanceof Human) { 
				Human h = (Human)animals[i];
				h.readBook();
			}else if(animals[i] instanceof Tiger) {
				Tiger t = (Tiger)animals[i];
				t.hunting();
			}else if(animals[i] instanceof Eagle) {
				Eagle e = (Eagle)animals[i];
				e.flying();
			}
			
		}
		
		

	}

}
