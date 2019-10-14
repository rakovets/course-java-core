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
		for (int i=0; i < marks.length; i++) {
			sum = sum + marks[i];

		}
		double s = sum/marks.length;
		System.out.println("среднее арифметическое: "+ Math.round(s*100.00)/100.00);

		return s;
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
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < marks.length; i++)
		{
			min = Math.min(min, marks[i]);
		}
		System.out.println(min);
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
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < marks.length; i++)
		{
			max = Math.max(max, marks[i]);
		}
		System.out.println(max);
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