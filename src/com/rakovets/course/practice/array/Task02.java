package com.rakovets.course.practice.array;

import com.rakovets.course.util.StandardInputTask;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * Разработать программу для электронного дневника:
 * которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task02 extends StandardInputTask {
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
	 * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
	 * @param marks отметки
	 * @return средняя арифметическая отметка
	 */
	static double getAverageMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		double sum = 0;
		DecimalFormat df = new DecimalFormat("#.00");
		for (int i=0;  i < marks.length;  i++) {
			for (int j=0; j < marks.length; j++) {
				sum = sum + marks[i][j];
			}
		}
		double sum0 = (sum)/(marks.length * marks[0].length);


		System.out.println(df.format(sum0));

		return sum0;
	}

	/**
	 * Возвращает минимальную отметку за весь период обучения.
	 * @param marks отметки
	 * @return минимальная отметка
	 */
	static int getMinMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks.length; j++) {
				{
					if(min==0){System.out.println(min);
					} else {
						min = Math.min(min, marks[i][j]);
					}
				}
			}
		}
		System.out.println(min);
		return min;
	}

	/**
	 * Возвращает максимальну отметку за весь период обучения.
	 * @param marks отметки
	 * @return максимальная отметка
	 */
	static int getMaxMark(int[][] marks) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks.length; j++) {
				{
					max = Math.max(max, marks[i][j]);
				}
			}
		}
		System.out.println(max);
		return max;
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