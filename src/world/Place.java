package world;

public class Place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human jerson = new Human();
		
		jerson.age = 38;
		jerson.carrer = "Petroleum Engineer";
		jerson.eyeColor ="brwon";
		jerson.height = 1.78;
		jerson.name ="Jerson Paiva";
		
		jerson.speak();
		jerson.eat();
		jerson.walk();
		
		
	Human selma = new Human();
		
		selma.age = 32;
		selma.carrer = "Nurse";
		selma.eyeColor ="brwon";
		selma.height = 1.68;
		selma.name ="Selma Robas";
		
		selma.speak();
		selma.eat();
		selma.walk();
		
		Human h = new Human();
		h.speak();
		
		Human2 hm = new Human2("Carmelo Antony", "black eyes", 31, 1.96, "Basket Ball Player");
		hm.speak();
	}

}
