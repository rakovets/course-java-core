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
        long amount = -1500L;

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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String toAccountingFormat = "";
        final int SEPARETION_THREE_SIGNS = 1000;
        String minus = "";
        if (amount < 0) {
            minus = "-";
            amount = -amount;
        }
        while (amount / SEPARETION_THREE_SIGNS != 0) {
            if (amount % SEPARETION_THREE_SIGNS == 0) {
                amount = amount / SEPARETION_THREE_SIGNS;
                toAccountingFormat = " 000" + toAccountingFormat;
            } else{
                toAccountingFormat = " " + amount % SEPARETION_THREE_SIGNS + toAccountingFormat;
            } amount = amount / SEPARETION_THREE_SIGNS;
           }
        return minus + amount + toAccountingFormat;
    }
}
