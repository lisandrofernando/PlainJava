package world;

public class Human2 {

	String name;
	String eyeColor;
	int age;
	double height;
	String carrer;
	
	
	
	
	public Human2(String name, String eyeColor, int age, double height, String carrer) {
		super();
		this.name = name;
		this.eyeColor = eyeColor;
		this.age = age;
		this.height = height;
		this.carrer = carrer;
	}

	public void speak() {
		
		System.out.println("Hello My name is :" + name);
		System.out.println("I'm :" + age);
		System.out.println("I have :" + height);
		System.out.println("I'm a :" + carrer);
		System.out.println("My eye color are :" + eyeColor);
	}
	
	public void eat() {
		System.out.println("I'm eating...");
	}
	
	public void walk() {
		System.out.println("I'm walking...");
	}
}
