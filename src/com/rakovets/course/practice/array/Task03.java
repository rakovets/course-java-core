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
		double[] sum = new double[marks.length];
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[0].length; j++) {
				sum[i] += marks[i][j];
			}
		}
		double[] average = new double[sum.length];
		for (int k = 0; k < sum.length; k++) {
			average[k] = sum[k] / marks[0].length;
			average[k] = Math.round(average[k] * 100);
			average[k] /= 100;
		}
		return average;
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
		// int[] min = new int[marks.length];
		int[] min = new int[marks.length];
		for (int i = 0; i < marks.length; i++) {
			min[i] = marks[i][0];
		}
			for (int i = 0; i < marks.length; i++) {
				for (int j = 0; j < marks[0].length; j++) {
					if (min[i] > marks[i][j]) {
						min[i] = marks[i][j];
					}
				}
			}
			return  min;
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
		int[] max = new int[marks.length];
		for (int i = 0; i < marks.length; i++) {
			max[i] = marks[i][0];
		}
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[0].length; j++) {
				if (max[i] < marks[i][j]) {
					max[i] = marks[i][j];
				}
			}
		}
		return  max;
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