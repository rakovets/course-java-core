package com.rakovets.course.examples.module2.part6;

/**
 * Класс математических функций и констант - Math
 */
public class Task09 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// псевдослучайное вещественное в диапозоне [0 до 1).
		double d = Math.random();
		System.out.println("случайное число = " + d);

		// минимальное из двух чисел
		double min = Math.min(2, 8);
		// System.out.println("минмум = " + min);

		double max = Math.max(2, 8);
		// System.out.println("максимум = " + max);

		// получение числа по модулю
		int abs = Math.abs(-10);
		// System.out.println(abs);

		// Вычисление квадратного корня
		double sqrt = Math.sqrt(9);
		// System.out.println("корень квадратный 9 = " + sqrt);

		// возведение в степень
		double pow = Math.pow(2, 8);
		// System.out.println("2 в степени 8 = " + pow);

		// возрашает квадратный корень от сумммы квадратов x и y
		double y = 3;
		double x = 4;
		double hypot = Math.hypot(x, y);
		// System.out.println("sqrt (x^2 + y^2) =" + hypot);

	}
}