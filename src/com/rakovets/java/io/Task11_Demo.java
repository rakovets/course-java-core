package com.rakovets.java.io;

import java.io.*;

/**
 * Прочитать текст Java-программы и заменить все модификаторы доступа public на private
 */

public class Task11_Demo {
	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("src//Task11_Demo.java");
		int i;
		String text = "";
		while ((i = fileReader.read()) != -1) {
			text = text + (char) i;
		}

		String replace = text.replace("public", "private");
		FileWriter fileWriter = new FileWriter("task11_Replace.txt", false);
		fileWriter.write(replace);
		fileWriter.flush();
	}
}