package com.rakovets.course.java.core.practice.looping_statements;

/**
 * Разработать программу для табличного процессора.
 * Программа генерирует порядковые номера для записей при создании таблицы.
 *
 * @author Dmitry Rakovets
 */
class Task05 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int numberRows = 10;
        boolean isEnableHeaderRow = true;

        String numbersColumn = generateNumbersColumn(numberRows, isEnableHeaderRow);
        System.out.printf("Result:\n%s", numbersColumn);
    }

    /**
     * Генерирует текст, который содержит графа с порядковыми номерами записей.
     *
     * @param numberRows        количество записей в таблице
     * @param isEnableHeaderRow имеет ли таблица строку-заголовок <code>true</code>/<code>false</code>, если имеет, то
     *                          для первой строки (не путать с первой записью) не нужно генерировать номер
     * @return текст, который содержит графа с порядковыми номерами записей, где каждый номер на новой строке
     */
    static String generateNumbersColumn(int numberRows, boolean isEnableHeaderRow) {
        String numColumns = "";
        if (isEnableHeaderRow) {
            numColumns = "\n";
            for (int i = 1; i < numberRows - 1; i++) {
                numColumns += i + "\n";
            }
            numColumns += numberRows - 1;
        } else {
            for (int i = 1; i < numberRows; i++) {
                numColumns += i + "\n";
            }
            numColumns += numberRows;
        }
        return numColumns;
    }
}
