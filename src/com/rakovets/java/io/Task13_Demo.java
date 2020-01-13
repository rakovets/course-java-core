package com.rakovets.java.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * В файле, содержащем фамилии студентов и их оценки, записать прописными буквами фамилии тех студентов,
 * которые имеют средний балл более “7”.
 */

public class Task13_Demo {
	public static void main(String[] args) throws IOException {

		int sum = 0;
		String text = "";
		ArrayList<String> arrayName = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader("task13_Students.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				text = text + line + "\n";
				String[] res = line.split("[ .,:;]+\\s*");
				for (int i = 1; i < res.length; i++) {
					sum = sum + Integer.parseInt(res[i]);
				}
				if ((sum / (res.length - 1)) > 7) {
					arrayName.add(res[0].toLowerCase());
				}
				sum = 0;
			}
		}
		FileWriter fileWriter = new FileWriter("task13_StudentsNew.txt");
		fileWriter.write(text + "\nCредний балл более “7”:\n");
		for (String name : arrayName) {
			fileWriter.append(name + "\n");
		}
		fileWriter.flush();
	}
}
