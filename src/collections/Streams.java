package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Angel");
		list.add("John");
		list.add("Nikel");
		list.add("Ash");
		list.add("Gilbert");
		list.add("Angelica");
		int count = 0;
		
		for(int i=0; i<list.size(); i++) {
			String actual = list.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		
		Long d = list.stream().filter(s->s.startsWith("N")).count();
		System.out.println(d);
		/*
		 * Instead of writing a collection, it can be simplified this way
		 * To merge two different lists can be used the Concat method for example:
		 * List<String> newStream = Stream.concat(names.stream(),name.stream())
		 */
		Long st = Stream.of("Derik","Carlos","Azel","Lina").filter(n-> 
		{
			 n.startsWith("L");
			 return true;
		 }).count();
		 System.out.println("the st is: " + st);
		 
		 list.stream().filter(s->s.length()>5).forEach(s->System.out.println(s));
		 list.stream().filter(s->s.length()>5).limit(1).forEach(s->System.out.println(s));
		 streamMap();
		 streamColect();
	}
	public static void streamMap() {
		
		Stream.of("Altino","Don", "Alexa","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		Stream.of("Altino","Don", "Alexa","Adam","Rama").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
	public static void streamColect() {
		
	 List<String> ls =	Stream.of("Altino","Don", "Alexa","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
	System.out.println(ls.get(0));
	
	List<Integer> values = Arrays.asList(2,3,4,5,3,3);
	values.stream().distinct().forEach(s->System.out.println(s));
    List<Integer>	li =   values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li.get(2));	
	}
	
}
