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
        byte dayOfWeekNumber = 5;

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
        final byte beginNumber = 1, endNumber = 8;
        String nameWeekDay = " ";
        if (dayOfWeekNumber >= beginNumber && dayOfWeekNumber < endNumber) {
            switch (dayOfWeekNumber) {
                case 1:
                    nameWeekDay = "MONDAY";
                    break;
                case 2:
                    nameWeekDay = "TUESDAY";
                    break;
                case 3:
                    nameWeekDay = "WEDNESDAY";
                    break;
                case 4:
                    nameWeekDay = "THURSDAY";
                    break;
                case 5:
                    nameWeekDay = "FRIDAY";
                    break;
                case 6:
                    nameWeekDay = "SATURDAY";
                    break;
                case 7:
                    nameWeekDay = "SUNDAY";
                    break;
            }
            return nameWeekDay;
        }
        return null;
    }
}
