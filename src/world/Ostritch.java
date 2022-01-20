package world;

public class Ostritch extends Animal{

	public Ostritch(int age, String gender, int weightInLbs) {
		super(age, gender, weightInLbs);
		
	}
/*
 * This the overriding method, more specific to the Ostritch
 */
	public void fly() {
		System.out.println("Not able to fly");
	}
@Override
public void move() {
	// TODO Auto-generated method stub
	
}
}
