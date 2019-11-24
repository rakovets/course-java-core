package com.rakovets.course.challenge.generics;

import java.util.Arrays;

/**
 * Specification of task 7
 * Реализуйте шаблонный метод для двоичного поиска в массиве.
 */

public class Task07 {
	static <T> void binarySearch(T[] array, T key) {
		int index = Arrays.binarySearch(array, key);
		System.out.printf("Binary search, index = %d", index);
	}
}
