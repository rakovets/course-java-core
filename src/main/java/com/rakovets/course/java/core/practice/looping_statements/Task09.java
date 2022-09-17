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
        String first = "";
        StringBuffer amountWithFormat = new StringBuffer("");
        if (amount < 0) {
            amount = -amount;
            first = "-";
        }
        while (amount / 1000 != 0) {
            if (amount % 1000 == 0) {
                amountWithFormat.insert(0, " 000");
            } else {
                amountWithFormat.insert(0, (" " + amount % 1000));
            }
            amount = amount / 1000;
        }
        if (amount / 1000 == 0) {
            amountWithFormat.insert(0, "" + amount);
        } else if (amount / 100 == 0) {
            amountWithFormat.insert(0, "" + amount);
        }
        return first + amountWithFormat.toString();
    }
}
