package a08_반복;

public class SumFor {

	public static void main(String[] args) {
		int result = 0; 
		
		for(int i = 0; i < 100; i++) {
			result += (i+1);
			System.out.println("i값은"+ i);
			
		}
		
		System.out.println("결과: "+ result);

	}

}
