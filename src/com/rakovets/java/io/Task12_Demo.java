package com.rakovets.java.io;

import java.io.*;

/**
 * Прочитать текст Java-программы и записать в другой файл в обратном порядке символы каждой строки
 */

public class Task12_Demo {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("task12_ReverseNew.txt");
		try (BufferedReader br = new BufferedReader(new FileReader("task12_Reverse.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String res = line;
				fileWriter.append(new StringBuffer(res).reverse() + "\n");
			}
		}
		fileWriter.flush();
	}
}