package com.rakovets.java.io;

import java.io.*;

/**
 * Задан файл с java-кодом. Прочитать текст программы из файла и записать в другой файл
 * в обратном порядке символы каждой строки.
 */

public class Task06_Demo {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInput = new FileInputStream("task06_ReverseTextJavaCode.txt");
		int i;
		String text = "";
		while ((i = fileInput.read()) != -1) {
			text = text + (char) i;
		}
		fileInput.close();

		StringBuffer stringBuffer = new StringBuffer(text);
		stringBuffer.reverse();

		byte[] buffer = stringBuffer.toString().getBytes();
		FileOutputStream fileOutput = new FileOutputStream("task06_ReverseTextJavaCode_new.txt");
		fileOutput.write(buffer);
		fileOutput.close();
	}
}