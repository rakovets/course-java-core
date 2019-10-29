package com.rakovets.course.practice.methods;

import com.rakovets.course.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy. В профиле игрока месяц
 * еобходимо выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task05 extends StandardInputTask {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		byte monthNumber = INPUT_SCANNER.nextByte();

		getNameMonth(monthNumber);
	}

	/**
	 * Возвращает название месяца, в зависимости от его порядкового номера
	 * @param monthNumber - номер месяца
	 * @return месяц на английском языке (UPPER CASE)
	 */
	static String getNameMonth(byte monthNumber) {
		String answer = null;
		switch(monthNumber){
			case 1:
				answer = "JANUARY";
				break;
			case 2:
				answer = "FEBRUARY";
				break;
			case 3:
				answer = "MARCH";
				break;
			case 4:
				answer = "APRIL";
				break;
			case 5:
				answer = "MAY";
				break;
			case 6:
				answer = "JUNE";
				break;
			case 7:
				answer = "JULY";
				break;
			case 8:
				answer = "AUGUST";
				break;
			case 9:
				answer = "SEPTEMBER";
				break;
			case 10:
				answer = "OCTOBER";
				break;
			case 11:
				answer = "NOVEMBER";
				break;
			case 12:
				answer = "DECEMBER";
				break;
		}
		return answer;
	}
}