package com.rakovets.course.practice.array;

import com.rakovets.course.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по каждому предмету.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		int countDisciplines = INPUT_SCANNER.nextInt();
		int countSemesters = INPUT_SCANNER.nextInt();
		int[][] marks = nextArray(countDisciplines, countSemesters);

		// Вызов методов
		getAverageMark(marks);
		getMinMark(marks);
		getMaxMark(marks);
	}

	/**
	 * Возвращает средне арифметическую отметку по предметам за весь период обучения с округлением до 2 знаков.
	 * @param marks отметки
	 * @return средняя арифметическая отметка
	 */
	static double[] getAverageMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
//		int sumAllMarks = 0;
		double[] averageMark = new double[marks.length];
		for (int i = 0; (i <= (marks.length - 1)); i++) {
			int sumAllMarks = 0;
			for (int j = 0; (j <= (marks[i].length - 1)); j++) {
				sumAllMarks += marks[i][j];
			}
			averageMark[i] = (double) Math.round((sumAllMarks * 100.0) / marks[i].length) / 100.0;
			System.out.println(averageMark[i]);
		}
		return averageMark;
	}

	/**
	 * Возвращает минимальную отметку по предметам за весь период обучения.
	 * @param marks отметки
	 * @return минимальная отметка
	 */
	static int[] getMinMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int[] minimumMark = new int[marks.length];
		for (int i = 0; (i <= (marks.length - 1)); i++) {
			int minimum = marks[i][0];
			for (int j = 0; (j <= (marks[i].length - 1)); j++) {
				if (minimum > marks[i][j]) {
					minimum = marks[i][j];
				}
				minimumMark[i] = minimum;
			}
		}
		return minimumMark;
	}

	/**
	 * Возвращает максимальну отметку по предметам за весь период обучения.
	 * @param marks отметки
	 * @return максимальная отметка
	 */
	static int[] getMaxMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int[] maximumMark = new int[marks.length];
		for (int i = 0; (i <= (marks.length - 1)); i++) {
			int maximum = marks[i][0];
			for (int j = 0; (j <= (marks[i].length - 1)); j++) {
				if (maximum < marks[i][j]) {
					maximum = marks[i][j];
				}
				maximumMark[i] = maximum;
			}
		}
		return maximumMark;
	}

	private static int[][] nextArray(int countDisciplines, int countSemesters) {
		int[][] marks = new int[countDisciplines][countSemesters];
		for (int i = 0; i < countDisciplines; i++) {
			for (int j = 0; j < countSemesters; j++) {
				marks[i][j] = INPUT_SCANNER.nextInt();
			}
		}
		return marks;
	}
}