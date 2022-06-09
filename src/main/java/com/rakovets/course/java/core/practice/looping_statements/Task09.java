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
        long amount = -123;

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
    private static final String SPACE = " ";

    private static final String MINUS = "-";

    static int countDigits(long num) {
        int i = 0;
        if (num < 0) {
            num *= -1;
        }
        if (num == 0) {
            i++;
        }
        for (; num > 0; i++) {
            num /= 10;
        }
        return i;
    }

    static String convertToAccountingFormat(long amount) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String text = "";
        int count = countDigits(amount);
        int buf = count;
        if (amount < 0) {
            text += MINUS;
            amount *= -1;
        }
        for (int i = count; i != 0; i--) {
            double result = (amount % Math.pow(10, i));
            result /= Math.pow(10, i - 1);
            if (i % 3 == 0 && i != buf) {
                text += SPACE;
            }
            text += (int) result;
        }
        return text;
    }
}
