package com.rakovets.course.challenge.generics;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создайте шаблонный класс Matrix. Необходимо реализовать:
 * <p>
 * заполнение матрицы с клавиатуры
 * заполнение случайными значениями
 * отображение матрицы
 * арифметические операции +, –, *, / по правилам работы с матрицами
 * поиск максимального и минимального элемента
 * подсчет среднеарифметического значения
 */

public class Matrix<T> {
	static Integer[][] createMatrixUsingKeyboard() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите количество строк в матрице:  ");
		int numberRowsMatrix = scanner.nextInt();
		System.out.print("Введите количество столбцов в матрице:  ");
		int numberColumnsMatrix = scanner.nextInt();
		Integer[][] matrix = new Integer[numberRowsMatrix][numberColumnsMatrix];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("Ведите элемент матрицы строка №%d, столбец №%d:  ", i + 1, j + 1);
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.printf("Создана матрица:  %s", printMatrix(matrix));
		return matrix;
	}

	static Integer[][] createMatrixRandom() {
		System.out.println("\nЗаполнение массива случайными числами.");
		Random random = new Random();
		Integer[][] matrix = new Integer[random.nextInt(2) + 3][random.nextInt(2) + 3];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = random.nextInt(1000) + 1;
			}
		}
		System.out.printf("Создан массив:  %s", printMatrix(matrix));
		return matrix;
	}

	static <T> String printMatrix(T[][] matrix) {
		return Arrays.deepToString(matrix);
	}

	static void addition(Integer[][] matrix) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nСложение. Введите число:  ");
		int numberAddition = scanner.nextInt();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] += numberAddition;
			}
		}
		System.out.printf("Матрица после прибавления числа %d:  %s", numberAddition, printMatrix(matrix));
	}

	static void subtraction(Integer[][] matrix) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nВычитание. Введите число:  ");
		int numberSubtraction = scanner.nextInt();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] -= numberSubtraction;
			}
		}
		System.out.printf("Матрица после вычитания числа %d:  %s", numberSubtraction, printMatrix(matrix));
	}

	static void multiplication(Integer[][] matrix) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nУмножение. Введите число:  ");
		int numberMultiplication = scanner.nextInt();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] *= numberMultiplication;
			}
		}
		System.out.printf("Матрица после умножения на число %d:  %s", numberMultiplication, printMatrix(matrix));
	}

	static void division(Integer[][] matrix) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nДеление. Введите число:  ");
		int numberDivision = scanner.nextInt();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] /= numberDivision;
			}
		}
		System.out.printf("Матрица после деления на число %d:  %s", numberDivision, printMatrix(matrix));
	}

	static <T extends Comparable<T>> void searchMaximumAndMinimum(T[][] matrix) {
		T maximum = matrix[0][0];
		T minimum = matrix[0][0];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j].compareTo(maximum) > 0) {
					maximum = matrix[i][j];
				}
				if (matrix[i][j].compareTo(minimum) < 0) {
					minimum = matrix[i][j];
				}
			}
		}
		System.out.printf("\nМаксимальное число в матрице = %d", maximum);
		System.out.printf("\nМинимальное число в матрице = %d", minimum);
	}

	static <T extends Number> void averageValueMatrix(T[][] matrix) {
		int sumValues = 0;
		int numbersValuesMatrix = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sumValues += (int) matrix[i][j];
				numbersValuesMatrix++;
			}
		}
		System.out.printf("\nСреднеарифметическое значение элементов матрицы = %d", sumValues / numbersValuesMatrix);
	}
}
