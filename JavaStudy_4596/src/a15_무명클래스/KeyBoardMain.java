package a15_무명클래스;

public class KeyBoardMain {

	public static void main(String[] args) {
		KeyBoard keyUp = new KeyBoard() {
			@Override
			public void keyUp() {
				System.out.println("위쪽 버튼을 눌렀습니다.");
			}
		};
		
		KeyBoard keyDown = new KeyBoard() {
			@Override
			public void keyDown() {
				System.out.println("아래 버튼을 눌렀습니다.");
			}
		}; 
		
		keyUp.keyUp();
		keyDown.keyDown();
	}

}
