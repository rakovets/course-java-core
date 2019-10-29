package com.rakovets.course.practice.methods;

import com.rakovets.course.util.StandardInputTask;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task04 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		byte weekdayNumber = INPUT_SCANNER.nextByte();

		getNameWeekday(weekdayNumber);
	}

	/**
	 * Возвращает название дня недели, в зависимости от его порядкового номера.
	 * @param weekdayNumber - номер дня недели
	 * @return день недели на английском языке (UPPER CASE)
	 */
	static String getNameWeekday(byte weekdayNumber) {
		String answer = null;

		switch(weekdayNumber){
			case 1:
				answer = "MONDAY";
				break;
			case 2:
				answer = "TUESDAY";
				break;
			case 3:
				answer = "WEDNESDAY";
				break;
			case 4:
				answer = "THURSDAY";
				break;
			case 5:
				answer = "FRIDAY";
				break;
			case 6:
				answer = "SATURDAY";
				break;
			case 7:
				answer = "SUNDAY";
				break;
		}
		return answer;
	}

}