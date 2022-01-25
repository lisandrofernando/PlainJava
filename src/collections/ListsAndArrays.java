package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListsAndArrays {
	
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
		
		
	Map<String, String> resul = mapCreator(names);
		
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
	
	public static Map<String, String>mapCreator(List<String> namesList){
		Map<String, String> resultMap = new HashMap<String, String>();
		for (String name:namesList) {
			resultMap.put(name.charAt(0) +"name",name);
		}
		return resultMap;
	}

}
