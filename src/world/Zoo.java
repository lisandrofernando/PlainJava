package world;

public class Zoo {

	public static void main(String[] args) {
		
		Bird chicken = new Bird(3,"M", 6);
		chicken.eat();
		chicken.sleep();
		
		Animal fish = new Fish(2,"M", 3);
		
		moveAnimal(fish);
		moveAnimal(chicken);

	}

	public static void moveAnimal(Animal animal) {
		animal.move();
		
	}
	
}
