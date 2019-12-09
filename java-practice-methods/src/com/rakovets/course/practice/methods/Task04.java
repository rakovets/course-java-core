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
		String day = null;
		switch(weekdayNumber) {
			case 1:
				day = "MONDAY";
				break;
			case 2:
				day = "TUESDAY";
				break;
			case 3:
				day = "WEDNESDAY";
				break;
			case 4:
				day = "THURSDAY";
				break;
			case 5:
				day = "FRIDAY";
				break;
			case 6:
				day = "SATURDAY";
				break;
			case 7:
				day = "SUNDAY";
				break;
		}
		return day;


	}

	}

