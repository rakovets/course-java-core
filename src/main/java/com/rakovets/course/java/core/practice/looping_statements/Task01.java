package com.rakovets.course.java.core.practice.looping_statements;

/**
 * Разработать программу для табличного процессора.
 * Программа генерирует порядковые номера для записей при создании таблицы.
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
        int rows = 8;

        String numbersColumn = generateNumbersColumn(rows);
        System.out.printf("Result:\n%s", numbersColumn);
    }

    /**
     * Генерирует текст, который содержит графа с порядковыми номерами записей.
     *
     * @param numberRows количество записей в таблице
     * @return текст, который содержит графа с порядковыми номерами записей, где каждый номер на новой строке
     */
    static String generateNumbersColumn(int numberRows) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String numbersGenerator = "";
        for (int i = 1; i <= numberRows; i++) {
            if (i < numberRows) {
                numbersGenerator += i + "\n";
            } else {
                numbersGenerator += i;
            }
        }
        return numbersGenerator;
    }
}
