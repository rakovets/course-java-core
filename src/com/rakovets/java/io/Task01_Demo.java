package com.rakovets.java.io;

import java.io.*;

/**
 * Задан файл с многострочным тестом. Прочитать и вывести этот файл в консоль построчно.
 */

public class Task01_Demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("notes.txt");
		int i;
		while ((i = fileInput.read()) != -1) {
			System.out.print((char) i);
		}
		fileInput.close();
	}
}