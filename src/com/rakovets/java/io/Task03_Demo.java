package com.rakovets.java.io;

import java.io.*;

/**
 * Задан файл с текстом, найти и вывести в консоль все слова, для которых последняя буква одного слова совпадает с
 * первой буквой следующего слова
 */

public class Task03_Demo {
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
		System.out.println("Последняя буква одного слова совпадает с первой буквой следующего слова:  ");
		for (int j = 0; j < listWords.length; j++) {
			if (j < listWords.length - 1) {
				if (listWords[j].charAt(listWords[j].length() - 1) == listWords[j + 1].toLowerCase().charAt(0)) {
					System.out.printf("%s - %s\n", listWords[j], listWords[j + 1]);
				}
			}
		}
	}
}