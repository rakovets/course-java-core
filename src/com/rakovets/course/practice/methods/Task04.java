package com.rakovets.course.practice.methods;

import com.rakovets.course.util.StandardInputTask;

import java.time.MonthDay;

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
		switch (weekdayNumber){
			case 1:
				return "MONDAY";
			case 2:
				return "TUESDAY";
			case 3:
				return "WEDNESDAY";
			case 4:
				return "THURSDAY";
			case 5:
				return "FRIDAY";
			case 6:
				return "SATURDAY";
			case 7:
				return "SUNDAY";
			default:
				return null;
		}
		//return null;
	}
}