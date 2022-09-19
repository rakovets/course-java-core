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
        long amount = -834563456234L;

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
        long amountCopy = amount;
        if (amountCopy < 0) {
            amountCopy *= -1;
        }
        String number = String.valueOf(amountCopy);
        int length = number.length() - 3;
        String output = "";
        output += String.valueOf(amountCopy % 1000);
        amountCopy /= 1000;
        for (int i = length; i > 0; i -= 3) {
            output = (amountCopy % 1000) + " " + output;
            amountCopy /= 1000;
        }
        if (amount < 0) {
            output = "-" + output;
        }
        return output;
    }
}
