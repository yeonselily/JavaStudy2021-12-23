package a23_예외;

import java.io.IOException;
import java.nio.channels.IllegalSelectorException;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@lombok.Data
class Message{
	private String name; 
}
public class ExceptionEx {
	
	public void test() throws IOException, IndexOutOfBoundsException{
		System.out.println("test");
	}

	public static void main(String[] args) {
		ExceptionEx ex = new ExceptionEx(); 
		
		try {
			ex.test();
		} catch (IndexOutOfBoundsException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			if(1 == 1) {
				throw new NullPointerException("값이 비었어요.");
				}
		}catch(Exception e) {
			System.out.println("빈값 오류 처리");
		}
		
		try{
			if(1 == 1) {
		}
			throw new CustomException("오류가 났어요.");
		}catch(Exception e) {
			System.out.println("커스텀 오류 처리");
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Message> messageList = new ArrayList<Message>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i+1); 
			if( i % 2 == 0) {
				messageList.add(new Message("test"));
			}else {
				messageList.add(null);
			}
			 
		}
		
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println(list.get(i));
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.println(messageList.get(i).getName());
			}
			
			System.out.println("문서저장");
		}catch(IndexOutOfBoundsException boundsException) {
			boundsException.printStackTrace();  //오류난부분 보여주기 
		}catch(NullPointerException nullPointerException) {
			nullPointerException.printStackTrace();
		}catch(Exception exception){
			exception.printStackTrace();  //최상위 클래스 (모든 예외를 다 받아줌)
										// 맨밑에 써야함 
		}finally {
			System.out.println("문서저장");  //오류가 나도 꼭 실행해야부분
		}
		
		System.out.println("프로그램종료");		
	}

}
