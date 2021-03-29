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

       /* String word = "";
        boolean negative = false;
        int separationTime = 0;

        if (amount < 0) {
            amount = amount * -1;
            negative = true;
        }

        String str = Long.toString(amount);

        for (int i = 1; i <= str.length(); i++) {
            word = amount % (long) Math.pow(10, i) / (long) Math.pow(10, i - 1) + word;
            separationTime++;

            if (separationTime == 3 && i != str.length()) {
                word = " " + word;
                separationTime = 0;
            }
        }

        if (negative) {
            word = "-" + word;
        }

        return word; */
        return new DecimalFormat("###,###").format(amount).replace("\u00a0"," ");
    }
}
