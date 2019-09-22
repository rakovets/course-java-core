package com.rakovets.course.puzzle.module2;

/**
 * Объясни результат
 */
public class MagicDouble {
	public static void main(String[] args) {
		double d1 = 1.0 / 3;
		double d2 = 1 / 3;
		System.out.println(d1 == d2);

		double f = 0.0;
		for (int i = 1; i <= 10; i++) {
			f += 0.1;
		}
		System.out.println(f);
	}
}