package world;

public class Fish extends Animal{

	public Fish(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		
	}

	public void swim() {
		System.out.println("Fish is swimming....");
	}

	@Override
	public void move() {
		System.out.println("Swiming fast...");
		
	}
}
