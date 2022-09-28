package com.rakovets.course.java.core.practice.decision_making_statements;

/**
 * Разработать программу для desktop приложения
 * которая выведет приветствии для пользователя в зависимости от времени суток.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int hour = 20;

        String greeting = getGreetingByHour(hour);
        System.out.printf("Result: %s", greeting);
    }

    /**
     * Возвращает приветствие в зависимости от значения часов.
     *
     * @param hour текущее значение часов (от 0 до 23)
     * @return одно из приветствий:
     * <ul>
     *     <li>when 6-11 that 'Good morning'</li>
     *     <li>when 12-17 that 'Good day'</li>
     *     <li>when 18-23 that 'Good evening'</li>
     *     <li>when 0-5 that 'Good night'</li>
     * </ul>
     */
    static String getGreetingByHour(int hour) {
        final int time1 = 6;
        final int time2 = 12;
        final int time3 = 18;
        final int time4 = 24;
        final int time5 = 0;
        if (hour >= time1 && (hour < time2)) {
            return "Good morning";
        } else if (hour >= time2 && hour < time3) {
            return "Good day";
        } else if (hour >= time3 && hour < time4) {
            return "Good evening";
        } else if (hour >= time5 && hour < time1) {
            return "Good night";
        } else {
            return null;
        }
    }
}
