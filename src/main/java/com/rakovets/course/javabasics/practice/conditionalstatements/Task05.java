package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardInputTask;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате 'dd/MM/yyyy'. В профиле игрока необходимо
 * месяц выводить не в числовом формате, а в текстовом. Определить название месяца в зависимости от номера.
 *
 * @author Dmitry Rakovets
 */
public class Task05 extends StandardInputTask {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        byte monthNumber = 1;

        String monthName = getMonthName(monthNumber);
        System.out.printf("Result: %s", monthName);
    }

    /**
     * Возвращает название месяца, в зависимости от его порядкового номера
     *
     * @param monthNumber номер месяца
     * @return месяц на английском языке (UPPER CASE)
     */
    static String getMonthName(byte monthNumber) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        switch ((int)monthNumber) {
            case (byte)1:
                return "JANUARY";
            case (byte)2:
                return "FEBRUARYY";
            case (byte)3:
                return "MARCH";
            case (byte)4:
                return "APRIL";
            case (byte)5:
                return "MAY";
            case (byte)6:
                return "JUNE";
            case (byte)7:
                return "JULY";
            case (byte)8:
                return "AUGUST";
            case (byte)9:
                return "SEPTEMBER";
            case (byte)10:
                return "OCTOBER";
            case (byte)11:
                return "NOVEMBER";
            case (byte)12:
                return "DECEMBER";
        }
        return null;
    }
}
