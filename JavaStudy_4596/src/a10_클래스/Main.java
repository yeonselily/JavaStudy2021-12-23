package a10_클래스;

public class Main {
	
	private Service service;
	
	public Main() {
		service = new Service();
	}
	
	public int computer(int price) {
		return (int)(price * service.getDiscount());  
	}
	
	public int phone(int price) {
		return  price - (int)(price * service.getDiscount());
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		System.out.println(m.computer(1000000));
		System.out.println(m.phone(800000));
		
	}
}

