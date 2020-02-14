package lv.olga.random;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ScannerNamesRandom {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter your name");

			names.add(sc.nextLine());

		}
		System.out.println(names);
		
		ArrayList<Integer> numbersGenerated = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
		Random random = new Random();
		int nr = random.nextInt(10)+1;
		if(!numbersGenerated.contains(nr)) {
			numbersGenerated.add(nr);
		}else {
			i--;
		}
		
		System.out.println(numbersGenerated.toString());
		}
	}

	}


