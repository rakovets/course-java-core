package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог.
 *
 * @author Dmitry Rakovets
 */
class Task04 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        byte dayOfWeekNumber = 1;

        String nameWeekday = getDayOfWeekNumber(dayOfWeekNumber);
        System.out.printf("Result: %s", nameWeekday);
    }

    /**
     * Возвращает название дня недели, в зависимости от его порядкового номера.
     *
     * @param dayOfWeekNumber номер дня недели
     * @return день недели на английском языке (UPPER CASE)
     */
    static String getDayOfWeekNumber(byte dayOfWeekNumber) {
        String weekDay;
        if (dayOfWeekNumber < 1 || dayOfWeekNumber > 7) {
            weekDay = null;
        } else if (dayOfWeekNumber == 1) {
            weekDay = "MONDAY";
        } else if (dayOfWeekNumber == 2) {
            weekDay = "TUESDAY";
        } else if (dayOfWeekNumber == 3) {
            weekDay = "WEDNESDAY";
        } else if (dayOfWeekNumber == 4) {
            weekDay = "THURSDAY";
        } else if (dayOfWeekNumber == 5) {
            weekDay = "FRIDAY";
        } else if (dayOfWeekNumber == 6) {
            weekDay = "SATURDAY";
        } else {
            weekDay = "SUNDAY";
        }
        return weekDay;
    }
}
