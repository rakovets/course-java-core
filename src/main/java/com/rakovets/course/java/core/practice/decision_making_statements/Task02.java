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
        int hour = 8;

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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String greetingByHour;
        switch (hour) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                greetingByHour = "Good night";
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                greetingByHour = "Good morning";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                greetingByHour = "Good day";
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                greetingByHour = "Good evening";
                break;
            default:
                greetingByHour = null;
        }
        return greetingByHour;
    }
}
