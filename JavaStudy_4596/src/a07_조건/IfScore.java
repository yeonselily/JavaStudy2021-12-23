package a07_조건;

public class IfScore {

	public static void main(String[] args) {
		int score = 101;
		 
		/*만약에 스코어가 90 이상이면 A등급입니다.\
		 * 90 이상이면 A등급입니다. 
		 * 80 이상이면 B등급입니다. 
		 * ... 
		 * 60 이상이면 D등급입니다. 
		 * 나머지는 전부 F등급입니다.  
		 * 100 초과거나 0 미만이면 계산할 수 없는 점수입니다. 
		*/ 
		if (score > 100 || score < 0)
		{ System.out.println("계산할 수 없는 점수입니다.");} 
		else if (score > 89)
			{ System.out.println("A등급입니다."); 
			}
		else if (score > 79) { 
			System.out.println("B등급입니다.");
		}
		else if (score > 69) { 
			System.out.println("C등급입니다.");}
		else if (score > 59) { 
				System.out.println("D등급입니다.");	}
		else{ 
			System.out.println("F등급입니다.");	}
		
				

	
	}
} 