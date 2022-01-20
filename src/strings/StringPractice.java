package strings;

public class StringPractice {

	public static void main(String[] args) {
		

		String myStr = "ABCDEF";
		 System.out.println(myStr.length());
		 System.out.println(myStr.substring(2,4));
		 
		 String a = "Hello";
		 String b ="Good Morning";
		 
		 System.out.println(a.charAt(4));
		 System.out.println(b.indexOf("Morning",0));
		 
		 if(a.equals(b)) {
			 System.out.println("We are all good");
		 }else if (!a.equals(b)){
			 System.out.println("The strings are different");
		 }

	}

}
