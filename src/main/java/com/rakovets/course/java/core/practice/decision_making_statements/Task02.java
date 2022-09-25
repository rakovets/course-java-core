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
        int hour = 25;

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
        final int beginningOfMorningHour = 6;
        final int beginningOfDayHour = 12;
        final int beginningOfEveningHour = 18;
        final int midnightHour = 24;
        String greetingByHour = "";

        if (hour >= (midnightHour - midnightHour) && hour <= midnightHour) {
            if (hour < beginningOfMorningHour || hour == midnightHour) {
                greetingByHour = "Good night";
            } else if (hour < beginningOfDayHour) {
                greetingByHour = "Good morning";
            } else if (hour < beginningOfEveningHour) {
                greetingByHour = "Good day";
            } else if (hour < midnightHour) {
                greetingByHour = "Good evening";
            }
            return greetingByHour;
        } else {
            return null;
        }
    }
}
