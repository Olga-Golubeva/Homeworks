package lv.olga;

import java.util.Scanner;

public class TestRegex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int atbilde = sc.nextInt();

	String regex = "^([1-4])";
	String data = Integer.toString(atbilde);
	
	
	System.out.println(data.matches(regex));

	}

}
