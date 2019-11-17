package com.rakovets.course.challenge.tasks_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		try {
			exceptionScanner();
		} catch (FileNotFoundException e) {
			System.out.println("\nException handling. Не удается найти указанный файл !!!");
			e.printStackTrace();
		}
		System.out.println("Программа завершена");
	}

	static void exceptionScanner() throws FileNotFoundException {
		File file = new File("abc");
		Scanner scanner = new Scanner(file);
	}
}
