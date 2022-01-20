package controlflow;

public class MyUtils {

	
	
	public static void printSomeNumbers(int numbers) {
		
		System.out.println(numbers);
	}
	/*
	 * This is a function below
	 */
	public static int sumNumbers(int value) {
		int result = value + 35;
		System.out.println(result);
		return result;
	}
	
	public static String myWord(String value) {
		
		String word ="My name is : " + value;
		System.out.println(word);
		return word;
	}
}
