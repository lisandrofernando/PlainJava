package collections;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		/*
		 * Maps are like dictionaries. They are represented with key and value
		 * The HashMap also has no order the way print values, however the LinkedHashMap have order.
		 * The TreeMap will maintain natural order, alphabetic...
		 */
		
		HashMap<String, String> dict = new HashMap<String, String>();
		dict.put("Brave", "ready to face and endure danger pain; showing courage");
		dict.put("Brilliant", "exceptionally clever or tallented");
		dict.put("Joy", "a feeling of great pleasure or hapiness");
		dict.put("Confidence", "The state of feeling certain about the truth of something");
		
		for(String word: dict.keySet()) {
			System.out.println(word);
			System.out.println(dict.get(word));
		}
		
		for(Map.Entry<String, String> dictionary :dict.entrySet()) {
			
			System.out.println(dictionary.getKey());
			System.out.println(dictionary.getValue());
		}
	
	}

}
