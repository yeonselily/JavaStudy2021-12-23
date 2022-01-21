package a21_스태틱;

public class Singleton {

	public static void main(String[] args) {
		 Apple 본사 = Apple.getInstance();
		 Apple 한국지사 = Apple.getInstance();
		 
		 AppleProduct iphone12 = 본사.createProduct("아이폰", "12");
		 AppleProduct iphone13 = 한국지사.createProduct("아이폰", "13");
		 AppleProduct ipad_pro = 한국지사.createProduct("아이패드", "pro");
		 
		 System.out.println(iphone12);
		 System.out.println(iphone13);
		 System.out.println(ipad_pro);
		 
		 본사.setProduct_code(100);
		 한국지사.setProduct_code(200);
		 
		 System.out.println(본사.getProduct_code());

	}

}
