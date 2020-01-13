package com.rakovets.java.io;

import java.io.*;

/**
 * Прочитать строки из файла и поменять местами первое и последнее слова в каждой строке
 */

public class Task14_Demo {
	public static void main(String[] args) throws IOException {
		String exchange;

		FileWriter fileWriter = new FileWriter("task14_NotesNew.txt");
		try (BufferedReader br = new BufferedReader(new FileReader("task14_Notes.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] res = line.split("[ .,:;]+\\s*");
				exchange = res[0];
				res[0] = res[res.length - 1];
				res[res.length - 1] = exchange;
				exchange = null;
				for (int i = 0; i < res.length; i++) {
					if (i < res.length - 1) {
						fileWriter.write(res[i] + " ");
					} else {
						fileWriter.write(res[i] + ".\n");
					}
				}
			}
		}
		fileWriter.flush();
	}
}