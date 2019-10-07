package com.rakovets.course.practice.methods;

import com.rakovets.course.util.StandardInputTask;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy.
 * В профиле игрока мы должны месяц выводить не в числовом формате, а в текстовом.
 * Определить название месяца в зависимости от номера.
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
        String result;
        switch (monthNumber){
        case 1:
        result = "JANUARY";
        break;
        case 2:
        result = "FEBRUARY";
        break;
        case 3:
        result = "MARCH";
        break;
        case 4:
        result = "APRIL";
        break;
        case 5:
        result = "MAY";
        break;
        case 6:
        result = "JUNE";
        break;
        case 7:
        result = "JULY";
        break;
        case 8:
        result = "AUGUST";
        break;
        case 9:
        result = "SEPTEMBER";
        break;
        case 10:
        result = "OCTOBER";
        break;
        case 11:
        result = "NOVEMBER";
        break;
        case 12:
        result = "DECEMBER";
        break;
        default:
        result = null;
      }



        return result;
    }

}