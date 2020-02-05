package lecture7_home;

import java.util.Scanner;

public class WhileCheck {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Input value ");

		int inputvalue;

		while (input.hasNextInt()) {

			if (input.hasNextInt()) {
				inputvalue = input.nextInt();
				System.out.println("Your input is " + inputvalue);
			}

			else {
				System.out.println("Your input is not int");
				input.next();
			}

		}
	}
}
