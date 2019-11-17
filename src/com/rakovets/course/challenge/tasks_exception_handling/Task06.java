package com.rakovets.course.challenge.tasks_exception_handling;

import java.util.Random;

public class Task06 {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(3) + 1;
		try {
			randomThrowMethod(num);
		} catch (NullPointerException | ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			if (num == 1) {
				System.out.println("\nAttention Attention Attention - Null Pointer Exception!!!");
				ex.printStackTrace();
			} else if (num == 2) {
				System.out.println("\nAttention Attention Attention - Вылет за пределы массива!!!");
				ex.printStackTrace();
			} else System.out.println("\nAttention Attention Attention - Деление на 0 !!!");
			ex.printStackTrace();
		}
		System.out.println("Программа завершена");
	}

	static void randomThrowMethod(int num) throws NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException {
		switch (num) {
			case 1:
				String vacuum = null;
				vacuum.length();
				break;
			case 2:
				int[] array = new int[2];
				array[100] = 7;
				break;
			case 3:
				int zero = 10 / 0;
				break;
			default:
				System.out.println("Default на всякий случай");
		}
	}
}
