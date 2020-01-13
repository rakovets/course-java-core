package com.rakovets.java.io;

import java.io.*;
import java.util.Arrays;
import java.util.Random;

/**
 * Создать программно и заполнить файл случайными целыми числами. Отсортировать содержимое файла по возрастанию.
 */

public class Task08_Demo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fileOutput = new FileOutputStream("task08_RandomNumbers.txt");
		PrintStream printStream = new PrintStream(fileOutput);
		Random random = new Random();
		Integer[] arrayNumbersInt = new Integer[50];
		for (int i = 0; i < arrayNumbersInt.length; i++) {
			arrayNumbersInt[i] = random.nextInt(1000);
		}
		Arrays.sort(arrayNumbersInt);
		for (int i = 0; i < arrayNumbersInt.length; i++) {
			printStream.println(arrayNumbersInt[i]);
		}
		printStream.close();
		fileOutput.close();
	}
}
