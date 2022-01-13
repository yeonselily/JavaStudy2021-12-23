package a11_배열;

public class ArrayEx {

	public static void main(String[] args) {
		int[] num = new int[10000]; 
		
		
		for(int i = 0; i < num.length; i++) {
			num[i] = 10 * (1+i);
		}
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		String[] strArray = {"일","이", "삼"}; 
		for(int i = 0; i <strArray.length; i++) {
			System.out.println(strArray[i]);
		}

	}

}
