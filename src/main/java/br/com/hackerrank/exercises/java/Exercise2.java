package br.com.hackerrank.exercises.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) throws IOException {
		showExerciseDescription();
		execute();
	}

	private static void showExerciseDescription() {
		System.out.println("\"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source.\" — (Wikipedia: End-of-file)\r\n" + 
				"\r\n" + 
				"The challenge here is to read  lines of input until you reach EOF, then number and print all N lines of content.\n");
	}

	private static void execute() {
		try (InputStream in = Exercise2.class.getClassLoader().getResourceAsStream("exercise2.txt");
				Scanner scanner = new Scanner(in)) {

			int lineIndex = 1;
			while (scanner.hasNext()) {	
				String lineContext = scanner.nextLine();
				System.out.println(lineIndex + " " + lineContext);
				lineIndex++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
