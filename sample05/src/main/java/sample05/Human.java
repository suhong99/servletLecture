package sample05;

public class Human {
	private String name;
	private int age;
	private String address;
	
	public Human() {
		
	}
	

	public Human(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
}
