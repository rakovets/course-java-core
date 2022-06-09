package com.rakovets.course.java.core.practice.looping_statements;

import java.sql.PreparedStatement;

/**
 * Разработать программу для бухгалтерии.
 * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом.
 * <p>
 * Например:
 * 1234567890 -> "1 234 567 890"
 *
 * @author Dmitry Rakovets
 */
class Task09 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        long amount = 1500L;

        String amountWithAccountingFormat = convertToAccountingFormat(amount);
        System.out.printf("Result: %s", amountWithAccountingFormat);
    }

    /**
     * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
     * пробелом.
     *
     * @param amount сумма
     * @return сумма в бухгалтерском формате
     */

    private static final String SPACE = " ";
    private static final String MINUS = "-";

    static long countDigits(long num) {
        int i = 0;
        if (num < 0) {
            num *= -1;
        }
        for (; num > 0; i++) {
            num /= 10;
        }
        return i;
    }

    static String convertToAccountingFormat(long amount) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String text = "";
        if (amount < 0) {
            amount *= -1;
            text += MINUS;
        }
        if (amount == 0) {
            text += amount;
        } else {
            int count = (int) countDigits(amount);
            int buf = count;
            for (int i = count; i != 0; i--) {
                int result = (int) (amount % Math.pow(10, i));
                result /= Math.pow(10, i - 1);
                if (i != buf && i % 3 == 0) {
                    text += SPACE;
                }
                text += result;
            }
        }
        return text;
    }
}
