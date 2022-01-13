package a15_무명클래스;
/**
 * 무명 익명 클래스 
 * @author ITPS
 *
 */
class Test extends AnonymousClass {
	@Override
	public void showInfo() {
		System.out.println("테스트 정의");
		
	}
}

public class Main {

	public static void main(String[] args) {
		AnonymousClass anonymousClass = new AnonymousClass() {
			
			@Override
			public void showInfo() {
				// 클래스 저장하면 스텍메모리 잡아먹어서 재사용 하지 않을때 사용 
				// stack memory 낭비 안함 
				// 버튼 클릭 이벤트 버튼 여러개 만들 필요 없음 기능 똑같으면 
				// click 메소드  event, (mouse) click,down, up
				// override 추상클래스 
				// 재정의 안되면 생성 자채를 할 수 없음 
				// AnonymousClass anonymousClass = new AnonymousClass() 이렇게 안됨 
				System.out.println("test1입니다.");
			}
		};
		AnonymousClass anonymousClass2 = new AnonymousClass() {
			@Override
			public void showInfo() {
				System.out.println("test2입니다.");
				
			}
		};
		// 재사용 못하고 복사 붙여넣기 해야함. 
		anonymousClass.showInfo();
		anonymousClass2.showInfo();
		
		// 재사용 함 
		Test test1 = new Test();
		Test test2 = new Test();
		Test test3 = new Test();
		Test test4 = new Test();
		Test test5 = new Test();
	
	}

}
