package com.rakovets.java.io;

import java.io.*;

/**
 * Задан файл с java-кодом. Прочитать текст программы из файла и все слова public в объявлении атрибутов и
 * методов класса заменить на слово private. Результат сохранить в другой заранее созданный файл.
 */

public class Task05_Demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("task05_ReplacePublic.txt");
		int i;
		String text = "";
		while ((i = fileInput.read()) != -1) {
			text = text + (char) i;
		}
		fileInput.close();

		String replace = text.replace("public", "private");
		byte[] buffer = replace.getBytes();
		FileOutputStream fileOutput = new FileOutputStream("task05_ReplacePrivate.txt");
		fileOutput.write(buffer);
		fileOutput.close();
	}
}