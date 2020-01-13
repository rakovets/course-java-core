package com.rakovets.java.io;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задан файл со стихотворением Александра Пушкина. Определить частоту повторяемости всех букв в стихотворении,
 * 		игнорируя регистр. Вывести результат в файл в виде: а - 15 б - 7 и т.д.
 */

public class Task07_Demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("task07_Pushkin.txt");
		int i;
		String text = "";
		while ((i = fileInput.read()) != -1) {
			text = text + (char) i;
		}
		System.out.println(text);
		fileInput.close();

		Set<String> arrayUniqueLetters = new HashSet<>();
		List<String> arrayLettersOfText = new ArrayList<>();

		Pattern pattern = Pattern.compile("([a-z])");
		Matcher matcher = pattern.matcher(text.toLowerCase());
		while (matcher.find()) {
			arrayUniqueLetters.add(matcher.group());
			arrayLettersOfText.add(matcher.group());
		}

		FileOutputStream fileOutput = new FileOutputStream("task07_PushkinCounterLetters.txt");
		PrintStream printStream = new PrintStream(fileOutput);

		int counter = 0;
		for (String unit1 : arrayUniqueLetters) {
			for (String unit2 : arrayLettersOfText) {
				if (unit1.equals(unit2)) {
					counter++;
				}
			}
			printStream.printf("%s - %d\n", unit1, counter);
			counter = 0;
		}
		printStream.close();
		fileOutput.close();
	}
}