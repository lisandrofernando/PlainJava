package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Sets {

	public static void main(String[] args) {
		/*
		 * A set is very similar to an ArrayList but it prevents duplicates
		 * An ArrayList maintain the order the elements are placed on the collection whereas 
		 * HashSet no. In case you want the order to be maintained we can use LinkedHashSet
		 * The two string method to have a readable friendly representation
		 * The HashCode method helps instances of HashSet collections to check for the same data
		 * And prevent duplicates.
		 * On the line 42 we are converting the HashSet into an ArrayList
		 * The sort method only works for Lists, not Set. The sort method will sort a list alphabetically
		 * Or from small to the biggest value basically comparing the values.
		 */

		HashSet<Integer> values = new HashSet<Integer>();
		values.add(12);
		values.add(24);
		values.add(48);
		values.add(12);
		values.add(36);
		
		for(Integer value: values) {
			System.out.println(value);
		}
		
		LinkedHashSet<Integer> val = new LinkedHashSet<Integer>();
		val.add(12);
		val.add(24);
		val.add(48);
		val.add(12);
		val.add(36);
		
		for(Integer value: val) {
			System.out.println(value);
		}
		
		List<Integer> li = new ArrayList<Integer>(values);
		
		Collections.sort(li);
		
	}

}
