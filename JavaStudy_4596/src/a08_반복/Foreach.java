package a08_반복;

public class Foreach {
	public static void main(String[] args) {
		String[] strArray = {"박세0","박세1","박세2", "박세3"};
		int[] numArray = {1,2,3,4,5,6,7,8,9};
		
		// 일반 for문
		for(int i =0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
		int i = 0; 
		// foreach문 
		for(String str : strArray) {
			if(i == 3) {
				break; 
			}
			System.out.println(str);
			i++; 
		}
		
		for(int num : numArray) {
			System.out.println(num);
		}
	}

}
