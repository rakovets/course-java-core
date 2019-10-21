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
	 */                                             // Да, здесь можно сделать через "switch", но мне нравится через "if".
	    static String getNameMonth(byte monthNumber) {
	    	String mounth = null;
	    	if (monthNumber == 1)  {
				mounth = "JANUARY";
			} else if (monthNumber == 2) {
				mounth = "FEBRUARY";
			}  else if (monthNumber == 3) {
	    		mounth = "MARCH";
			}   else if (monthNumber == 4) {
				mounth = "APRIL";
			}   else if (monthNumber == 5) {
				mounth = "MAY";
			}   else if (monthNumber == 6) {
				mounth = "JUNE";
			}   else if (monthNumber == 7) {
				mounth = "JULY";
			}   else if (monthNumber == 8) {
				mounth = "AUGUST";
			}   else if (monthNumber == 9) {
				mounth = "SEPTEMBER";
			}   else if (monthNumber == 10) {
				mounth = "OCTOBER";
			}   else if (monthNumber == 11) {
				mounth = "NOVEMBER";
			}   else if (monthNumber == 12) {
	    		mounth = "DECEMBER";
			}
			return mounth;

	}
}