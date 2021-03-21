package com.rakovets.course.java.core.practice.decision_making_statement;

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
        int year = 2020;

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
        return false;
    }
}
