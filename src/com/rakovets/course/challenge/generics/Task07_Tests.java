package com.rakovets.course.challenge.generics;

import java.util.Arrays;

public class Task07_Tests {
	public static void main(String[] args) {
		Integer[] array = {50, 100, 400};
		Integer key = 400;
		System.out.printf("Array = %s\n", Arrays.toString(array));
		System.out.printf("Key = %d\n", key);
		Task07.binarySearch(array, key);
	}
}
