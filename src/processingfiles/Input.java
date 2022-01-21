package processingfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws FileNotFoundException {
	
		/*
		 * The scanner class we will read data or files from the input.
		 * System.in stands for the input stream
		 * Comment the below method to be able to run the fileInputStream Method
		 */
		for(int i=0; i<=3; i++) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter some Text: ");
	 	String enteredText = input.nextLine();
		System.out.println(enteredText);
	  }
		fileInputStream();
	}
	
	public static void fileInputStream() throws FileNotFoundException {
		
		File file = new File("myFile.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNext()) {
			String line = scan.nextLine();
			System.out.println(line);
		}
		scan.close();
	}
}
