package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardInputTask;

import java.time.Month;

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
        byte monthNumber = 9;

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
        // Код, решающий задачу пишем ниже, при этом используя параметры метод
        switch (monthNumber) {
            case 1:
                return Month.JANUARY.toString();
            case 2:
                return Month.FEBRUARY.toString();
            case 3:
                return Month.MARCH.toString();
            case 4:
                return Month.APRIL.toString();
            case 5:
                return Month.MAY.toString();
            case 6:
                return Month.JUNE.toString();
            case 7:
                return Month.JULY.toString();
            case 8:
                return Month.AUGUST.toString();
            case 9:
                return Month.SEPTEMBER.toString();
            case 10:
                return Month.OCTOBER.toString();
            case 11:
                return Month.NOVEMBER.toString();
            case 12:
                return Month.DECEMBER.toString();
            default:
                return null;
        }
    }
}
