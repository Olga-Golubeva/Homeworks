
public class IfElse49_50 {

	public static void main(String[] args) {

		//		Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. Go to the editor
//		Sample Output:
//
//			Input a number: 20                                                     
//			1

		int number = 9;
		if(number % 2 == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
		
		System.out.println("******************************************");
		
//		Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
		
		int[] nums;
		nums = new int[100];
		
		
		for(int i = 1; i <nums.length; i++) {
		if(i % 3 == 0) {
			System.out.print(i + " ");
		}
		
//		for(int i = 1; i <nums.length; i++) {
//		if(i % 5 == 0) {
//			System.out.print(i + " ");
		}
	}
	
}

