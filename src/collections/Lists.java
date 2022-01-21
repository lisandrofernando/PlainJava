package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		/* @ArrayList is one type of collections, there is also the LinkedList
		 * The @LikedList is better to manipulate the data comparing to ArrayList
		 * The @ArrayList is faster to retrieve data and slower for retrieval
		 * Some used methods add.All() in the ArrayList, remove.All(), clear(),contains(),isEmpty()
		 * retainAll()
		 */

		ArrayList <String> list = new ArrayList<String>();
		list.add("Aladin");
		list.add("Jasmin");
		list.add("Isabella");
		list.add("Mikey");
		
		System.out.println(list);
		
		
		for(String li:list) {
			System.out.println(li);
		}
			LinkedList<Integer> number = new LinkedList<Integer>();
			number.add(100);
			number.add(200);
			number.add(300);
			number.add(400);
			
			for(int numbers:number) {
				System.out.println(numbers);
			}
			
			ArrayList<Vehicle> car = new ArrayList<Vehicle>();
			car.add(new Vehicle("Toyta","HighLander",15000,true));
			car.add(new Vehicle("Toyta","Holux",12000,true));
			car.add(new Vehicle("Toyta","Canry",6000,true));
			Vehicle vh = new Vehicle("Jeep","Wrangler", 14000, false);
			car.add(vh);
			for(Vehicle cars:car) {
				System.out.println(cars);
			}
			printTheLists(car);
			printTheLists(number);
			printTheLists(list);
			
		}
	public static void printTheLists(List someList) {
		for(int i=0; i<someList.size(); i++) {
			System.out.println(someList.get(i));
		}
	 }
}


