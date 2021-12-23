package a08_반복;

public class SumWhile {

	public static void main(String[] args) {
		// 1 ~ 100까지 더하기
		int i = 0; 
		int result = 0;
		
		while(i < 100){
			System.out.println("i값은 "+  i);
			result += (i+1);
			i++; 
		}
		System.out.println("결과: "+ result);
	}

}
