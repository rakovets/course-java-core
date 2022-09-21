package com.rakovets.course.java.core.practice.decision_making_statements;

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
        String number = null;
        switch (dayOfWeekNumber) {
            case 1:
                number = "MONDAY";
                break;
            case 2:
                number = "TUESDAY";
                break;
            case 3:
                number = "WEDNESDAY";
                break;
            case 4:
                number = "THURSDAY";
                break;
            case 5:
                number = "FRIDAY";
                break;
            case 6:
                number = "SATURDAY";
                break;
            case 7:
                number = "SUNDAY";
                break;
        }
        return number;
    }
}

