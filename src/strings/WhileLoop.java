package strings;

public class WhileLoop {

	public static void main(String[] args) {
		
		String str = "We habe a large inventory of things in our warehouse falling in"
				+ "the category:apperal and the slightly"
				+ "more in demand category:makeup along with category:furniture and...";
		
		printCategory(str);
		
		for(int i=0; i<=100; i+=2) {
			System.out.println(i);
		}
	}
	
	/*
	 * extract all categories from the string argument
	 * @param str
	 */
	public static void printCategory(String string) {
		int i=0;
		while(true) {
			int found = string.indexOf("category:", i);
			if(found == -1) break;
			int start = found +9; //start of actual category
			int end = string.indexOf(" ", start);
			System.out.println(string.substring(start, end));
			i = end +1;
		}
		
	}
}
