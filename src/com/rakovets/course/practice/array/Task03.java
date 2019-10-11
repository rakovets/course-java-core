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
		double srArefm = 0.0;
		double summa = 0;
		int colvo = 0;
		double [] sector = new double[marks.length];


		for (int i = 0;i<marks.length;i++){
			summa=0;
			colvo = 0;
			for (int b =0;b<marks[i].length;b++){
				summa+=marks[i][b];
				colvo++;


			}
			srArefm = Math.round((summa/colvo)*100)/100.0;
			sector[i]=srArefm;
		}





		return sector;
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
		int[] minmark = new int[marks.length];
		int minimum = marks[0][0];
		for (int i = 0;i<marks.length;i++){
			minimum = marks[i][0];
			for (int b = 0;b < marks[i].length;b++){
				if (minimum > marks[i][b]) {
					minimum = marks[i][b];
				}



			}
			minmark[i] = minimum;

		}
		return minmark;
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

		int [] maxmark = new int[marks.length];
		int maximum = marks[0][0];
		for (int i = 0;i<marks.length;i++){
			maximum = marks[i][0];
			for (int b = 0;b < marks[i].length;b++){
				if (maximum < marks[i][b]) {
					maximum = marks[i][b];
				}



			}
			maxmark[i] = maximum;

		}
		return maxmark;
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