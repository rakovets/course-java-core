package com.rakovets.course.challenge.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Создайте шаблонный класс Array, который представляет собой массив, позволяющий хранить объекты заданного типа.
 * Необходимо реализовать:
 * <p>
 * заполнение массива с клавиатуры
 * заполнение массива случайными числами
 * отображение массива
 * поиск максимального значения
 * поиск минимального значения
 * подсчет среднеарифметического значения
 * сортировка массива по возрастанию
 * сортировка массива по убыванию
 * поиск значения в массиве, используя бинарный поиск
 * замена значения в массиве на новое значение
 */

public class Array<T> {
	static Integer[] createArrayUsingKeyboard() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите количество элементов в массиве:  ");
		int lengthArray = scanner.nextInt();
		Integer[] array = new Integer[lengthArray];
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Ведите элемент №%d:  ", i + 1);
			array[i] = scanner.nextInt();
		}
		System.out.printf("Создан массив:  %s", printArray(array));
		return array;
	}

	static Integer[] createArrayRandom() {
		System.out.println("Заполнение массива случайными числами.");
		Random random = new Random();
		Integer[] array = new Integer[random.nextInt(6) + 5];
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000) + 1;
		}
		System.out.printf("Создан массив:  %s", printArray(array));
		return array;
	}

	static <T> String printArray(T[] array) {
		return Arrays.toString(array);
	}

	static <T extends Comparable<T>> void searchMaximumInArray(T[] array) {
		T maximum = array[0];
		for (T value : array) {
			if (value.compareTo(maximum) > 0) {
				maximum = value;
			}
		}
		System.out.printf("\nМаксимальное число в массиве = %d", maximum);
	}

	static <T extends Comparable<T>> void searchMinimumInArray(T[] array) {
		T minimum = array[0];
		for (T value : array) {
			if (value.compareTo(minimum) < 0) {
				minimum = value;
			}
		}
		System.out.printf("\nМинимальное число в массиве = %d\n", minimum);
	}

	static <T extends Number> void averageValueArray(T[] array) {
		int sumValues = 0;
		for (T value : array) {
			sumValues += (int) value;
		}
		System.out.printf("Среднеарифметическое значение = %d\n", sumValues / array.length);
	}

	static <T> void sortingArrayMinimumMaximum(T[] array) {
		Arrays.sort(array);
		System.out.printf("Сортировка массива по возрастанию = %s\n", printArray(array));
	}

	static <T> void sortingArrayMaximumMinimum(T[] array) {
		Arrays.sort(array, Collections.reverseOrder());
		System.out.printf("Сортировка массива по убыванию = %s\n", printArray(array));
	}

	static <T> void binarySearch(T[] array, T key) {
		int index = Arrays.binarySearch(array, key);
		System.out.printf("Key = %d\n", key);
		System.out.printf("Поиск значения в массиве, используя бинарный поиск: index = %d\n", index);
	}

	static <T> void swapValueOldToNew(T[] array, T oldValue, T newValue) {
		int index = Arrays.binarySearch(array, oldValue);
		array[index] = newValue;
		System.out.printf("Замена значения %d на %d: %s", oldValue, newValue, printArray(array));
	}

}
