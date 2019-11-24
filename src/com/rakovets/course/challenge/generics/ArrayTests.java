package com.rakovets.course.challenge.generics;

import java.util.Arrays;

public class ArrayTests {
	public static void main(String[] args) {
		Integer[] array1 = Array.createArrayUsingKeyboard();
		Integer[] array2 = Array.createArrayRandom();
		Array.searchMaximumInArray(array2);
		Array.searchMinimumInArray(array2);
		Array.averageValueArray(array2);
		Array.sortingArrayMaximumMinimum(array2);
		Array.sortingArrayMinimumMaximum(array2);

		Integer key = array2[2];
		Array.binarySearch(array2, key);

		Integer oldValue = array2[2];
		Integer newValue = 111111;
		Array.swapValueOldToNew(array2, oldValue, newValue);
	}
}
