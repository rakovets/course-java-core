package com.rakovets.course.challenge.generics;

/**
 * Specification of task 4
 * Реализуйте шаблонный метод для поиска максимума в массиве.
 */

public class Task04 {
	static <T extends Comparable<T>> T searchMaximumInArray(T[] array) {
		T maximum = array[0];
		for (T value : array) {
			if (value.compareTo(maximum) > 0) {
				maximum = value;
			}
		}
		return maximum;
	}
}
