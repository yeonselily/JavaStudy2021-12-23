package a10_클래스;
/**
 * 
 *접근 지정자
 *default 패키지 영향  동일 패키지 내에서만 
 *public 접근 제한 없음  
 *private 동일 클래스 내에서만 (집 안에서만, 문 잠금) 
 *protected 패키지 영향  동일 패키지와 상속 받은 클래스 내부 
 *
 */

public class Car {
	private String carNumber; 
	private String model; 
	private int serialNumber; 
	
//oveload
	public Car() {
		System.out.println(carNumber);
		System.out.println(model);		
		
	}
	
	 
// 메게변수가 우선 순위가 더 높다 
	public Car(String carNumber, String model) {
		System.out.println(this);
		this.carNumber = carNumber;
		this.model = model;		
	}

 
	
	public void carInfo(){
		System.out.println("차량번호는  "+ carNumber + "이고 모델은 " + model + "입니다.");
		
	}


	public String getCarNumber() {
		return carNumber;
	}




	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getSerialNumber() {
		return serialNumber;
	}


	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}


	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber + 20210000;
	}
	
	
}
