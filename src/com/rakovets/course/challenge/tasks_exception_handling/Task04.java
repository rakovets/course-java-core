package com.rakovets.course.challenge.tasks_exception_handling;

public class Task04 {
	public static void main(String[] args) {
		try {
			zero();
		} catch (RuntimeException ex) {
			System.out.println("\nException handling. Деление на 0 !!!");
			ex.printStackTrace();
		}
		System.out.println("Программа завершена");
	}

	static void zero() throws Task04NewRuntimeException {
		int num = 10 / 0;
	}
}