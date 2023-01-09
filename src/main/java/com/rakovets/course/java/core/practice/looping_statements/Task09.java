package com.rakovets.course.java.core.practice.looping_statements;

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
        long amount = -1500000L;

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
        String bookkeepingFormat = "";
        String space = " ";
        long absolutValueOfNumber = Math.abs(amount);
        int counter = 0;
        while (absolutValueOfNumber != 0) {
            long lastOneNumber = absolutValueOfNumber % 10;
            if (counter == 0) {
                bookkeepingFormat += lastOneNumber;
                absolutValueOfNumber = absolutValueOfNumber / 10;
                counter++;
                continue;
            }
            if (counter % 3 == 0) {
                bookkeepingFormat = lastOneNumber + space + bookkeepingFormat;
            } else {
                bookkeepingFormat = lastOneNumber + bookkeepingFormat;
            }
            absolutValueOfNumber = absolutValueOfNumber / 10;
            counter++;
        }
        if (amount == 0) {
            bookkeepingFormat += amount;
        }
        if (amount < 0) {
            bookkeepingFormat = "-" + bookkeepingFormat;
        }
        return bookkeepingFormat;
    }
}
