package com.rakovets.course.examples.module2.part5;

/**
 * Литерал - это фиксированное значение в коде программы
 */
public class Task03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// *********************
		// float f1 = 3.2;
		float f2 = 0.5f; // литерал типа float
		float f3 = .5f; // ноль можно опустить
		// *********************

		char a = 'A'; // символьный литерал
		char b = 'B';
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + b);

		// **********************************
		boolean b1 = a > b; // литерал обозначающий истину
		b1 = false; // литерал обозначающий ложь
		// b1 = b1 + b1;

		String s = null; // литерал обозначающий отсутствие ссылки на объект.
		// Смотри "Ошибка на миллион"

	}
}