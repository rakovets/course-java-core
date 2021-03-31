package com.rakovets.course.java.core.practice.looping_statement;

import java.math.BigDecimal;
import java.math.BigInteger;
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
        long amount = 13524624562456L;

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
        boolean negative = false;
        String word = "";

        if (amount <= 999 && amount >= -999) {
            word = Long.toString(amount);
            return word;
        }

        if (amount < 0) {
            amount = amount * -1;
            negative = true;
        }

        word = amount % 1000 + "";
        amount = amount / 1000;

        while (amount != 0) {
            word = amount % 1000 + " " + word;
            amount = amount / 1000;
        }

        if (negative) {
            word = "-" + word;
        }

        return word;
    }
}
