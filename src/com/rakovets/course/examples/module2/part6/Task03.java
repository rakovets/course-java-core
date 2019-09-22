package com.rakovets.course.examples.module2.part6;

/**
 * Целочисленное деление
 */
public class Task03 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int di = 10 / 2;
		System.out.println(di);

		// если оба операнда целые числа, то при деление происходит
		// целочисленное деление, т.е. дробная часть попросту отбрасывается
		float dif = 1 / 2;
		System.out.println(dif);
		// FIXME исправь пример, чтобы вывелся резульата 0.5

		// деление на 0
		double d1 = .0 / 0;
		System.out.println(d1);
	}
}