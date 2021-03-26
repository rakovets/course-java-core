package com.rakovets.course.java.core.practice.looping_statement;

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
        int remainderDivision, flag = 0, counter = 0;
        if (amount < 0) {
            amount *= -1;
            flag = 1;
        }
        String formatString  = "";
        do {
            counter++;
            remainderDivision = (int) (amount % 10);
            formatString = remainderDivision + formatString;
            amount /= 10;
            if (counter == 3 && amount > 0) {
                formatString = " " + formatString;
                counter = 0;
            }
        }while (amount > 0);
        if (flag == 1) {
            formatString = "-" + formatString;
        }
        return formatString;
    }
}
