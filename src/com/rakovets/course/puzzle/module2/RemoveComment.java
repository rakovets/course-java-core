package com.rakovets.course.puzzle.module2;

/**
 * Раскомментируй некоторые строчки, чтобы программа вывела на экран числа 12 и
 * 2 (сначала 12, а затем 2).
 */
public class RemoveComment {
	public static void main(String[] args) {
		// Нельзя изменять строки с объявлением переменных.
		int x = 2;
		int y = 12;

		// FIXME Нужно раскомментировать необходимые строки, но нельзя менять их содержимое.

		//x = x * 3;
		//y = x + y;
		//x = y - x;
		//y = y - x;

		// Нельзя изменять строки отвечающие за вывод в консоль.
		System.out.println(x);
		System.out.println(y);
	}
}