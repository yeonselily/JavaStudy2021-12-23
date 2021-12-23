package a08_반복;

public class DoubleLoop {

	public static void main(String[] args) {
		// 1. while 
		int i=0; 
		while(i < 5) { 
			System.out.println("[i값:]"+i); 
			int j = 0; 
			while(j<3) { 
				System.out.println("j값:" + j);
				j++;
			}
			i++;
		}

		// 2. for 
		for(i = 0; i < 5; i++) {
			System.out.println("[i값:]"+ i); 
			for(int j =0; j <3; j++) {
				System.out.println("j값:" + j); 
			}
		}
	}

}
