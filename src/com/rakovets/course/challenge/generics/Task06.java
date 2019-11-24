package com.rakovets.course.challenge.generics;

import java.util.Arrays;

/**
 * Specification of task 6
 * Реализуйте шаблонный метод для сортировки массива.
 */

public class Task06 {
	static <T> void sortingArray(T[] array) {
		System.out.printf("Not sorting array = %s\n", Arrays.toString(array));
		Arrays.sort(array);
		System.out.printf("Sorting array = %s", Arrays.toString(array));
	}
}
