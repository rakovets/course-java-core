package com.rakovets.java.io;

import java.io.*;

/**
 * Задан файл с текстом. В каждой строке найти и вывести наибольшее число цифр, идущих подряд.
 */

public class Task04_Demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("notes.txt");
		int i;
		String text = "";
		while ((i = fileInput.read()) != -1) {
			text = text + (char) i;
		}
		fileInput.close();

		System.out.println(text);
		int counter = 0;
		String[] listWords = text.split("[\\s a-zA-Z .,:;]+\\s*");
		for (String unit : listWords) {
			if (counter < unit.length()) {
				counter = unit.length();
			}
		}
		System.out.println("Наибольшее число цифр: " + counter);
	}
}