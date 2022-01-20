package controlflow;

import java.util.Arrays;
import java.util.List;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Just printing something...");
		
		happy();
		
		happyWithArguments("Here are my arguments");
		
		happyWithArguments(180, 45,69);
		
		MyUtils.printSomeNumbers(1234567890);
		MyUtils.sumNumbers(89);
		MyUtils.myWord("Lisandro Fernando");
		
	}

	public static void happy() {
		
		System.out.println("I'm happy about code...");
	}
	
	public static void happyWithArguments(String value) {
		
		System.out.println(value);
	}
	
    public static void happyWithArguments(int value, int val, int var) {
		
		System.out.println(value + val + var);
	}
	
}
