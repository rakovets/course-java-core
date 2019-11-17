package com.rakovets.course.challenge.tasks_exception_handling;

import java.util.Random;

public class Task07 {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(2);
		try {
			if (num == 1) {
				throwMethodFiftyPercent();
			} else System.out.println("\nИсключение не сработало!");
		} catch (ArithmeticException ex) {
			System.out.println("\nИсключение сработало!\nОбработка исключения: Attention Attention Attention - Деление на 0 !!!");
			ex.printStackTrace();
		} finally {
			System.out.println("Finally: Метод, который в 50% случаев бросает исключение");
		}
		System.out.println("Программа завершена");
	}

	static void throwMethodFiftyPercent() throws ArithmeticException {
		int zero = 10 / 0;
	}
}
