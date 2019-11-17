package com.rakovets.course.challenge.tasks_exception_handling;

public class Task01 {
	public static void main(String[] args) {
		try {
			String vacuum = null;
			vacuum.length();
		} catch (Exception ex) {
			System.out.println("Обработка исключения: ");
			ex.printStackTrace();
		}
		System.out.println("Программа завершена");
	}
}