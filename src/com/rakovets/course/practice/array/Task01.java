package com.rakovets.course.practice.array;

import com.rakovets.course.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками только по одному предмету
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task01 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		int countMarks = INPUT_SCANNER.nextInt();
		int[] marks = nextArray(countMarks);

		// Вызов методов
		getAverageMark(marks);
		getMinMark(marks);
		getMaxMark(marks);
	}

	/**
	 * Возвращает средне арифметическую отметку с округлением до 2 знаков.
	 * @param marks отметки
	 * @return средняя арифметическая отметка
	 */
	static double getAverageMark(int[] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		double sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum += marks[i];
		}
		double average = sum;
		average /= marks.length;
		average = Math.round(average * 100);
		average /= 100;
		return average;
	}

	/**
	 * Возвращает минимальную отметку.
	 * @param marks отметки
	 * @return минимальная отметка
	 */
	static int getMinMark(int[] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int min = marks[0];
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < min) {
				min = marks[i];
			}
		}
		return min;
	}

	/**
	 * Возвращает максимальну отметку.
	 * @param marks отметки
	 * @return максимальная отметка
	 */
	static int getMaxMark(int[] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int length = marks.length;
		int max = marks[0];
		for (int i = 0; i < length; i++) {
			if (marks[i] > max) {
				max = marks[i];
			}
		}
		return max;
	}

	private static int[] nextArray(int countMarks) {
		int[] marks = new int[countMarks];
		for (int i = 0; i < countMarks; i++) {
			marks[i] = INPUT_SCANNER.nextInt();
		}
		return marks;
	}
}