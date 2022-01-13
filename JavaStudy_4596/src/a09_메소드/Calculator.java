package a09_메소드;

import java.util.Scanner;

public class Calculator {
	
	public static void add(double num1, double num2) { 
		System.out.println("두 수의 합은: "+ (num1 + num2));
	}
	
	public static void sub(double num1, double num2) { 
		System.out.println("두 수의 차는: "+ (num1 - num2));
	}
	
	public static void mul(double num1, double num2) { 
		System.out.println("두 수의 곱은: "+ (num1 * num2));
	}
	
	public static void div(double num1, double num2) { 
		if(num1 ==0 || num2 ==0) {
			System.out.println("0에서 나누거나 0으로 나누는 것은 불가능합니다.");
		}else {
		System.out.println("두 수의 몫은: "+ (num1 / num2));
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 곱셈");
			System.out.println("4. 나눗셈");
			System.out.println("0. 프로그램 종료");
			
			System.out.println("계산 방법을 선택해 주세요: ");
			double cmd = sc.nextInt();
			sc.nextLine();
			
			double num1, num2; 
			
			System.out.println("두 수를 입력해 주세요.");
			System.out.print("첫번째 수: ");
			num1 = sc.nextDouble(); 
			System.out.print("두번째 수: ");
			num2 = sc.nextDouble(); 
			sc.nextLine(); 
			
			if(cmd == 1) {
				add(num1, num2);
				
			}else if(cmd == 2) {
				sub(num1, num2);
				
		    }else if(cmd == 3) {
		    	mul(num1, num2);
		    }else if(cmd == 4) {
		    	div(num1, num2); 
		    }else if(cmd == 0) {
		    	System.out.println("프로그램 종료");
		    	break; 
		    
		   }else {
			   System.out.println("잘못된 선택입니다.");
		   }
		}
		
	}


}
