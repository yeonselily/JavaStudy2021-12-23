package a08_반복;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		// 2 X 1 ~ 9 X 9
		/* 
		 * [2단]
		 * 2 X 1 = 2
		 * 2 X 2 = 4
		 * 2 X 3 = 6
		 * ...
		 * 2 X 9 = 18 
		 */
		Scanner input = new Scanner(System.in); 
		System.out.print("시작 단수: ");
		int startDan = input.nextInt(); 
		input.nextLine();
		System.out.print("마지막 단수: ");
		int endDan = input.nextInt();
		input.nextLine(); 
		
		for(int dan = startDan; dan < endDan + 1; dan++) {
			System.out.println("["+ dan + " 단]");
			for(int num = 1; num < 10; num++) {
				System.out.println(dan + " X " + num + " = " + (dan*num));
			}
			System.out.println(); 
		}


		

		}
}
