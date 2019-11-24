package com.rakovets.course.challenge.generics;

/**
 * Specification of task 5
 * Реализуйте шаблонный метод для поиска минимума в массиве.
 */

public class Task05 {
	static <T extends Comparable<T>> T searchMinimumInArray(T[] array) {
		T minimum = array[0];
		for (T value : array) {
			if (value.compareTo(minimum) < 0) {
				minimum = value;
			}
		}
		return minimum;
	}
}
