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
        String amountWithAccountingFormat = "";
        int digitsCounter = 0;
        long digit;

        if (amount == 0) {
            return "0";
        }
        if (amount < 0) {
            amountWithAccountingFormat += "-";
            amount *= -1L;
        }
        for (long i = amount; i > 0 ; i /= 10) {
            digitsCounter++;
        }
        for (int i = digitsCounter - 1; i >= 0; i--) {
            digit = (long) (amount / Math.pow(10, i));
            amountWithAccountingFormat += digit;
            amount -= digit * Math.pow(10, i);
            if (i % 3 == 0 && i != 0) {
                amountWithAccountingFormat += " ";
            }
        }

        return amountWithAccountingFormat;
    }
}
