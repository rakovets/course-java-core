package com.rakovets.course.java.core.practice.looping_statement;

/**
 * Разработать программу для табличного процессора.
 * Программа генерирует номера строк при создании таблицы.
 *
 * @author Dmitry Rakovets
 */
class Task01 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int rows = 10;

        String numbersColumn = generateNumbersColumn(rows);
        System.out.printf("Result:\n%s", numbersColumn);
    }

    /**
     * Генерирует текст, который содержит столбец с номерами строк.
     *
     * @param numberRows количество строк в таблице
     * @return текст, который содержит столбец с номерами строк, где каждый номер на новой строке
     */
    static String generateNumbersColumn(int numberRows) {
        String column = "0";

        if (numberRows != 0) {
            column = "1";

            for (int i = 2; i <= numberRows; i++) {
                column += "\n" + i;
            }
        }

        return column;
    }
}
