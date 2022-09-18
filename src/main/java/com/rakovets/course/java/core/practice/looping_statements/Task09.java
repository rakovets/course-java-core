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
        long amount = 123456453456L;

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
        String amountConvertedToAccountingFormat = new String("");
        int numberOfCharactersInNumber = 0;
        long currentCharacter;
        final int COUNTER = 1;
        final int SEPARATE_INDICATOR = 3;
        final String WHITE_SPACE = new String(" ");
        final String MINUS_CHARACTER = new String("-");
        final long CONVERT_TO_MINUS = -1L;

        if (amount == 0) {
            return "0";
        }

        if (amount < 0) {
            amountConvertedToAccountingFormat += MINUS_CHARACTER;
            amount *= CONVERT_TO_MINUS;
        }

        for (long i = amount; i > 0; i /= 10) {
            numberOfCharactersInNumber++;
        }

        for (int i = numberOfCharactersInNumber - COUNTER; i >= 0; i--) {
            currentCharacter = (long) (amount / Math.pow(10, i));
            amountConvertedToAccountingFormat += currentCharacter;
            amount -= currentCharacter * Math.pow(10, i);

            if (i % SEPARATE_INDICATOR == 0 && i != 0) {
                amountConvertedToAccountingFormat += WHITE_SPACE;
            }
        }
        return amountConvertedToAccountingFormat;
    }
}
