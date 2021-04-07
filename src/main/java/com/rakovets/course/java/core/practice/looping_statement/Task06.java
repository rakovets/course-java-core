package com.rakovets.course.java.core.practice.looping_statement;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

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
class Task06 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        long amount = 1500;

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
    static String convertToAccountingFormat(long amount) {
        boolean negativeValue;
        if (amount < 0) {
            amount *= -1;
            negativeValue = false;
        } else {
            negativeValue = true;
        }
        String result = "";
        int rank = 0;
        long digit;
        while (amount / 10 != 0) {
            digit = amount % 10;
            amount /= 10;
            rank++;
            if (rank % 3 == 0) {
                result = " " + digit + result;
            } else {
                result = digit + result;
            }
        }
        digit = amount % 10;
        result = digit + result;

        if (negativeValue == false) {
            result = "-" + result;
        }
        return result;
    }
}
