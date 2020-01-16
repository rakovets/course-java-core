package com.rakovets.java.io;

import java.io.*;
import java.util.*;

/**
 * Задан файл со стихотворением Сергея Есенина.
 * Подсчитать частоту повторяемости каждого слова в стихотворении и
 * вывести эти слова в порядке возрастания частоты повторяемости.
 */

public class Task15_Demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("task15_Esenin.txt");
		int i;
		String text = "";
		while ((i = fileInput.read()) != -1) {
			text = text + (char) i;
		}
		System.out.println(text + "\n");
		fileInput.close();

		String[] arrayWordsOfText = text.split("[\\s .,:;?]+\\s*");
		Set<String> arrayUniqueWords = new HashSet<>(Arrays.asList(arrayWordsOfText));
		LinkedList<String> sortWords = new LinkedList<>();

		int counter = 0;
		for (String unit1 : arrayUniqueWords) {
			for (String unit2 : arrayWordsOfText) {
				if (unit1.equals(unit2)) {
					counter++;
				}
			}
			sortWords.add(counter + " - " + unit1);
			counter = 0;
		}
		sortWords.stream()
				.sorted()
				.forEach(System.out::println);
	}
}