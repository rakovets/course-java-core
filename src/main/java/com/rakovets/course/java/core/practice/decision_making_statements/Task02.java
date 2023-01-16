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
        int hour = 1;

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
        String massage;
        int earlyMorning = 6;
        int lateMorning = 11;
        int earlyDay = 12;
        int lateDay = 17;
        int earlyEvening = 18;
        int lateEvening = 23;
        int earlyNight = 0;
        int lateNight = 5;
        if (hour >= earlyMorning && hour <= lateMorning) {
            massage = "Good morning";
        } else if (hour >= earlyDay && hour <= lateDay) {
            massage = "Good day";
        } else if (hour >= earlyEvening && hour <= lateEvening) {
            massage = "Good evening";
        } else if (hour >= earlyNight && hour <= lateNight) {
            massage = "Good night";
        } else {
            massage = null;
        }
        return massage;
    }
}
