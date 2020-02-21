package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputMismatchExceptionExample {
	//The name of the input file.
	private final static String filename = "input.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(filename));
		
		while(scanner.hasNext())
			System.out.println(scanner.nextInt());
		
		//Close the scanner.
		scanner.close();
	}
}
