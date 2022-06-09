package com.rakovets.course.java.core.practice.decision_making_statements;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

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
    @Contract(pure = true)
    static @Nullable String getDayOfWeekNumber(byte dayOfWeekNumber) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String text;
        switch (dayOfWeekNumber) {
            case (1):
                text = "Monday";
                break;
            case (2):
                text = "Tuesday";
                break;
            case (3):
                text = "Wednesday";
                break;
            case (4):
                text = "Thursday";
                break;
            case (5):
                text = "Friday";
                break;
            case (6):
                text = "Saturday";
                break;
            case (7):
                text = "Sunday";
                break;
            default:
                throw new Error();
        }
        return text;
    }
}
