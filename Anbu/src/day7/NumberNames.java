package day7;

import java.util.Scanner;

public class NumberNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		String input = sc.nextLine();
		String number[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < input.length(); i++) {
			int digit = Character.getNumericValue(input.charAt(i));
			System.out.println(number[digit]);
			sc.close();
		}
	}

}
