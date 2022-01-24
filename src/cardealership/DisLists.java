package cardealership;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		LinkedHashMap<String, Integer> dict = new LinkedHashMap<String, Integer>();
//		dict.put("jane", 1);
//		dict.put("Paul", 2);
//		dict.put("John", 3);
//		dict.put("chris", 4);
//		
//		System.out.println(dict);
//		
//		for(Map.Entry<String, Integer> entry: dict.entrySet()) {
//			
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//		}
		
		List<String> names = new ArrayList<String>();
		names.add("Aladin");
		names.add("Jasmin");
		names.add("lago");
		names.add("Jafar");
		
		String []arrayString = names.toArray(new String[0]);
		System.out.println(names);
		
		
	
		
		printerList(names);
		
		printerList(arrayString);
		
		}

	public static void printerList(List<String> someList) {
	for (String name: someList) {
		System.out.println("Name :" + name);
	   }
	
	
	}
	
	public static void printerList(String [] toBePrinted) {
	printerList(Arrays.asList(toBePrinted));
		//System.out.println("The list to be printed :" + toBePrinted);
	}
}
