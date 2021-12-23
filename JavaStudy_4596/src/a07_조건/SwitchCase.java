package a07_조건;

public class SwitchCase {

	public static void main(String[] args) {
		char select = 'D'; 
		
		switch(select) { 
		case 'A': 
			System.out.println("A");
		case 'B': 
			System.out.println("B");
			break; 
		case 'C': 
			System.out.println("C");
			break; 
		case 'D': 
			System.out.println("D");
			break; 
		case 'F': 
			System.out.println("F");
			break; 
			
		default:
			System.out.println("잘못된 성적");
		}

	}

}
