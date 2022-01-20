package world;


/*
 * The animal class is an abstract class which has method with body and
 * Methods without body, it can only be extended.
 */
public abstract class Animal {

	int age;
	String gender;
	int weightInLbs;
	
	public Animal(int age, String gender, int weightInLbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weightInLbs = weightInLbs;
	}
	
	public void eat() {
		System.out.println("Eating....");
	}
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public abstract void move();
	
}
