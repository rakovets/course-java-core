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
        String amountImAccountingFormat = "";
        long lastNumber;
        int recordedDigits = 0;
        boolean negativNumber = false;

        if (amount == 0) {
            amountImAccountingFormat = "0";
        } else {
            if (amount < 0) {
                negativNumber = true;
                amount = Math.abs(amount);
            }
            for (; amount != 0; amount /= 10) {
                lastNumber = amount % 10;
                amountImAccountingFormat = lastNumber + amountImAccountingFormat;
                recordedDigits++;
                if (recordedDigits % 3 == 0 && amount > 10) {
                    amountImAccountingFormat = " " + amountImAccountingFormat;
                }
            }
        }

        if (negativNumber == true) {
            amountImAccountingFormat = "-" + amountImAccountingFormat;
        }

        return amountImAccountingFormat;
    }
}
