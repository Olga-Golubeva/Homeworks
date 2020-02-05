package lecture7_home;

import java.util.Scanner;

public class ScannerAndArrays {

	public static void main(String[] args) {

		// user input array length;
		// User add to element value;
		// Array values are printed to console;
		// Create methods for printing out arrays values
		// for loop

		
		System.out.println("Enter array length");

		Scanner sc = new Scanner(System.in);
		int inArrLength = sc.nextInt();
			int[] arr = new int[inArrLength];
			
			for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Enter array value");
			
			arr[i] = sc.nextInt();
			
			}
	
			for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]); 
			
				
		}
}
}
	


	
