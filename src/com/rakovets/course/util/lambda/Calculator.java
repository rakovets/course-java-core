package com.rakovets.course.util.lambda;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n1.Сложение \t 2.Вычитание \t 3.Умножение \t 4.Деление \t 5.Выход");
			int scan = scanner.nextInt();
			if (scan != 5) {
				System.out.println("Введите два значения: ");
				int result = action(scan).calculate(scanner.nextInt(), scanner.nextInt());
				System.out.println("Результат = " + result);
			} else {
				run = false;
				System.out.println("THE END");
			}
		}
	}

	private static Operationable action(int scan) {
		switch (scan) {
			case 1:
				return Integer::sum;
			case 2:
				return (x, y) -> x - y;
			case 3:
				return (x, y) -> x * y;
			case 4:
				return (x, y) -> x / y;
			default:
				return (x, y) -> 0;
		}
	}
}