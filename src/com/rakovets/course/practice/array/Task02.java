package com.rakovets.course.practice.array;

import com.rakovets.course.util.StandardInputTask;

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
		int marksAmount = 0;
		for (int[] n : marks) {
				marksAmount+= n.length;
		}
		int marksSum = Arrays.stream(marks)
				.flatMapToInt(x ->  Arrays.stream(x)).sum();

		double averageMark =  (double) marksSum / marksAmount;
		averageMark = Math.round(averageMark * 100.0) / 100.0;
		return averageMark;
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
		return Arrays.stream(marks)
				.flatMapToInt(x ->  Arrays.stream(x))
				.min()
				.getAsInt();
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
		return Arrays.stream(marks)
				.flatMapToInt(x -> (Arrays.stream(x)))
				.max()
				.getAsInt();
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