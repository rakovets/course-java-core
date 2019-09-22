package com.rakovets.course.examples.module2.part6;

/**
 * Инкремент и декримент - сложные случаи
 */
public class Task01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// int i =i++; ошибка, нельзя использовать для инициализации переменную
		// которую объявляешь в этой же строке кода.
		int i = 1;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++i);
		System.out.println(i);

		int i2 = 1;
		int i3 = i2++;
		// System.out.println(i2);
		// System.out.println(i3);

		int i4 = 1;
		// System.out.println(i4++ + ++i4);
		// System.out.println(i-- - --i);
		int r = -i-- - - --i; // головоломка

		float f = 1.1f;
		// System.out.println(++f);

		double d = 1.1;
		// System.out.println(--d);
	}
}