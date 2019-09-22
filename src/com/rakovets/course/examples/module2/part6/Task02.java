package com.rakovets.course.examples.module2.part6;

/**
 * Арифметические операции
 */
public class Task02 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// унарные операторы
		int u = -1;
		int u1 = +u;
		System.out.println(u + u1);

		// Сложение
		int i = 5 + 7;
		// System.out.println(i);
		int i2 = 'a' + 'z';
		// System.out.println(i2);

		// int a = 5, b = 7;
		// System.out.println(a + b);

		// System.out.println(12345 + 5432l);

		// ---------- Вычитание
		int d = 7 - 4;
		// System.out.println(d);

		// ********* Умножение
		int m = 2 * 2;

		/////////// Деление
		int di = 10 / 2;
		// System.out.println(d);
		float dif = 5 / 3;
		// System.out.println(dif);
		double d1 = .0 / 0;
		// System.out.println(d1);

		// System.out.println(2.00 - 1.10); // объяснить результат
	}
}