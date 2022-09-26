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
        String Format = "";
        int digitsCounter = 0;
        long number;
        if (amount == 0) {
            Format = "0";
        } else {
            if (amount < 0) {
                Format = "-";
                amount *= -1;
            }
            for (long i = amount; i > 0; i /= 10) {
                digitsCounter++;
            }
            for (int j = digitsCounter; j > 0; j--) {
                number = (long) (amount / Math.pow(10, j-1));
                amount -= number * Math.pow(10, j-1);
                if (j % 3 == 1 && j != 1) {
                    Format += number + " ";
                } else {
                    Format += number;
                }
            }
        }
        return Format;
    }
}
