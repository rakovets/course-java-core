package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для desktop приложения.
 * <p>
 * Определить является ли год високосным. Распределение високосных годов происходит следующим образом:
 *
 * <ul>
 *     <li>год, номер которого кратен 400, — високосный</li>
 *     <li>другие года, номера которых кратны 100, — невисокосные</li>
 *     <li>другие года, номер которых кратен 4, — високосные</li>
 *     <li>остальные года — невисокосные</li>
 * </ul>
 */

class Task07 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int year = 100;

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
        int denominator400 = 400;
        int denominator4 = 4;
        int denominator100 = 100;

        int leapYear400 = year % denominator400;
        int leapYear4 = year % denominator4;
        int nonLeapYear100 = year % denominator100;

        if (nonLeapYear100 == .00 &&  leapYear400 != .00) {
            return false;
        } else if (leapYear400 == .00) {
            return true;
        } else if (leapYear4 == .00) {
            return true;
        } else {
            return false;
        }
    }
}
