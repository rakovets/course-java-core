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
        long rightSideOfTheNumber = 0;
        String amountInAccountingFormat = "";
        boolean minusSign = amount < 0 ? true : false;
        rightSideOfTheNumber = Math.abs(amount % 1000);
        amount /= 1000;
        amountInAccountingFormat = Long.toString(rightSideOfTheNumber);
        while (amount % 1000 != 0) {
            rightSideOfTheNumber = Math.abs(amount % 1000);
            amount /= 1000;
            amountInAccountingFormat = rightSideOfTheNumber + " " + amountInAccountingFormat;
        }
        if (minusSign == true) {
            amountInAccountingFormat = "-" + amountInAccountingFormat;
        }
        return amountInAccountingFormat;
    }
}
