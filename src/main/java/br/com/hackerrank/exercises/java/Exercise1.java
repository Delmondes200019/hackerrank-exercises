package br.com.hackerrank.exercises.java;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		showExerciseDescription();
		execute();
	}

	private static void showExerciseDescription() {
		System.out.println(
				"Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):\r\n"
						+ "\r\n" + "A byte is an 8-bit signed integer.\r\n" + "A short is a 16-bit signed integer.\r\n"
						+ "An int is a 32-bit signed integer.\r\n" + "A long is a 64-bit signed integer.\r\n"
						+ "Given an input integer, you must determine which primitive data types are capable of properly storing that input.\n\n");
	}

	private static void execute() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of test cases: ");
		int numberOfTestsCases = sc.nextInt();

		for (int currentTestCaseNumber = 0; currentTestCaseNumber < numberOfTestsCases; currentTestCaseNumber++) {
			try {
				System.out.print("Enter a number: ");
				long userInput = sc.nextLong();
				
				System.out.println("\n" + userInput + " can be fitted in:");
				
				if (userInput >= Byte.MIN_VALUE && userInput <= Byte.MAX_VALUE)
					System.out.println("* byte");
				if (userInput >= Short.MIN_VALUE && userInput <= Short.MAX_VALUE)
					System.out.println("* short");
				if (userInput >= Integer.MIN_VALUE && userInput <= Integer.MAX_VALUE)
					System.out.println("* int");
				if (userInput >= Long.MIN_VALUE && userInput <= Long.MAX_VALUE)
					System.out.println("* long");
				
				System.out.println("");
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}
		}

		sc.close();
	}
}
