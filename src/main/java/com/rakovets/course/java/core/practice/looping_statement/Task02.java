package com.rakovets.course.java.core.practice.looping_statement;

/**
 * Разработать программу для табличного процессора.
 * Программа генерирует номера строк при создании таблицы.
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
        int numberRows = 13;
        boolean isEnableHeaderRow = true;

        String numbersColumn = generateNumbersColumn(numberRows, isEnableHeaderRow);
        System.out.printf("Result:\n%s", numbersColumn);
    }

    /**
     * Генерирует текст, который содержит столбец с номерами строк.
     *
     * @param numberRows        количество строк в таблице
     * @param isEnableHeaderRow имеет ли таблица строку-заголовок <code>true</code>/<code>false</code>, если имеет, то
     *                          для первой строки не нужно генерировать номер
     * @return текст, который содержит столбец с номерами строк, где каждый номер на новой строке
     */
    static String generateNumbersColumn(int numberRows, boolean isEnableHeaderRow) {
        String lineNumber = "";
        for (int i = 1; i <= numberRows; i ++) {
            if (!isEnableHeaderRow) {
                if (i != numberRows) {
                    lineNumber += i + "\n";
                } else {
                    lineNumber += i;
                }
            }
            if (isEnableHeaderRow) {
                if (i == 1) {
                    lineNumber += "\n" + i;
                } else if (i < numberRows) {
                    lineNumber += "\n" + i;
                }
            }
        }
        return  lineNumber;
    }
}
