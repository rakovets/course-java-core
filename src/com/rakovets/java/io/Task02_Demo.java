package com.rakovets.java.io;

import java.io.*;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова, начинающиеся с гласной буквы.
 */

public class Task02_Demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("notes.txt");
		int i;
		String text = "";
		while ((i = fileInput.read()) != -1) {
			text = text + (char) i;
		}
		fileInput.close();

		System.out.println(text);
		String[] listWords = text.split("[ .,:;]+\\s*");
		System.out.print("Все слова начинающиеся с гласной буквы:  ");
		String[] vowels = new String[]{"e", "y", "i", "o"};
		for (String word : listWords) {
			for (String letter : vowels) {
				if (word.toLowerCase().startsWith(letter)) {
					System.out.printf("\"%s\"  ", word);
				}
			}
		}
	}
}