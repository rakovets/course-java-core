package com.rakovets.course.javabasics.practice.conditionalstatements;

/**
 * Разработать программу для desktop приложения.
 * <p>
 * Определить является ли год високосным.
 * <ul>
 *  <li>В високосном годе - 366 дней, тогда как в обычном 365.</li>
 *  <li>Високосными годами являются все года делящиеся без остатка на 4 за исключением годов, которые делятся нацело на
 * 400</li>
 * </ul>
 */

public class Task07 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int year = 400;

        boolean isLeapYear = isLeapYear(year);
        System.out.printf("Result: %s", isLeapYear);
    }

    /**
     * Определяет является ли год високосным.
     *
     * @param year год
     * @return <code>false</code>/<code>true</code>
     */
    static boolean isLeapYear(int year) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        if (year % 4 == 0 & year % 400 == 0) return false;
        else if (year % 4 == 0) return true;
        else return false;

    }
}
