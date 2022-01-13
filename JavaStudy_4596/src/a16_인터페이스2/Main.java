package a16_인터페이스2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		UserService userService = null; 
		while(true) {
			System.out.println("[서비스 선택]");
			System.out.println("1.naver");
			System.out.println("2.kakao");
			int select = scanner.nextInt();
			scanner.nextLine();
			
			if(select == 1) {
				userService = new NaverUserServiceImpl(); //업케스팅 naverservice를 
				break;
			}else if(select ==2) {
				userService = new KakaoUserServiceImpl();
				break;
			}else {
				System.out.println("지원하지 않는 서비스입니다.");
			}
			System.out.println();
		}
		
		User user = userService.getUser(); // 인터페이스가 같기 때문에 getUser(), addUser()기능 같음 
		if(user == null) {
			System.out.println("입력하신 계정의 사용자를 찾을 수 없습니다.");
		}else {
			System.out.println(user.toString());
		}

	}

}
