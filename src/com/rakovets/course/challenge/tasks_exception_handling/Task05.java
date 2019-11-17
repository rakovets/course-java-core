package com.rakovets.course.challenge.tasks_exception_handling;

public class Task05 {
	public static void main(String[] args) {
		int num = -1;
		try {
			positiveValue(num);
		} catch (Task05NewException ex) {
			System.out.printf("\nException handling. Ваше число %d < 0 !!!: \n", num);
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		System.out.println("Программа завершена");
	}

	static void positiveValue(int num) throws Task05NewException {
		if (num < 0) {
			throw new Task05NewException("Attention Attention Attention - Ваше число < 0");
		}
	}
}

