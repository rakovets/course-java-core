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
    static String convertToAccountingFormat(long amount) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String startString;
        if (amount >= 0) {
            startString = "";
        } else {
            startString = "-";
            amount *= -1;
        }
        String amountWithAccountingFormat = startString;
        String reverseAmountWithAccountingFormat = "";
        String strAmount = Long.toString(amount);
        int strAmountLength = strAmount.length();
        for (int i = strAmountLength-1, k = 1; i >= 0; i--, k++) {
            reverseAmountWithAccountingFormat += strAmount.charAt(i);
            if (k % 3 == 0 && i != 0) {
                reverseAmountWithAccountingFormat += " ";
            }
        }
        System.out.println(reverseAmountWithAccountingFormat);
        for (int i = reverseAmountWithAccountingFormat.length() - 1; i >= 0; i--) {
            amountWithAccountingFormat += reverseAmountWithAccountingFormat.charAt(i);
        }
        return amountWithAccountingFormat;
    }
}
