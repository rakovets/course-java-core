package com.rakovets.course.challenge.generics;

/**
 * Specification of task 3
 * Реализуйте шаблонный метод для поиска среднеарифметического значения в массиве.
 */

public class Task03 {
	static <T extends Number> void averageValueArray(T[] array) {
		int sumValues = 0;
		for (T value : array) {
			sumValues += (int) value;
		}
		System.out.printf("Average value = %d", sumValues / array.length);
	}
}
