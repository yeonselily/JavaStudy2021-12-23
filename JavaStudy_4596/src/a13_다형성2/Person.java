package a13_다형성2;
//사람
/*
 * 이름
 */
public class Person {
	private String name; 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("[" + name + "의 정보 ]");
	}
	

}
