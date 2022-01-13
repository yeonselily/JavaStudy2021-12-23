package a16_인터페이스;

public class ButtonTest {

	public static void main(String[] args) {
		Button[] buttons = new Button[5]; 
		
		buttons[0] = new 초인종();
		buttons[1] = new 자동문버튼();
		
		for(Button button : buttons) {
			if(button == null) {
				continue;
			}
			button.onClick();
		}
		
	}

}
