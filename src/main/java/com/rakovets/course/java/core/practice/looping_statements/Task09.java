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
        long amount = -92346234;

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
        String temporary = Long.toString(amount);
        StringBuilder amountWithAccountingFormat = new StringBuilder();
        long count = 0;

        if (amount < 0) {
            amountWithAccountingFormat = new StringBuilder(temporary.replace("-", ""));
            amount = Long.parseLong(amountWithAccountingFormat.toString());
            amountWithAccountingFormat = new StringBuilder();
            for (long i = 0; i < temporary.length() - 1; i++) {
                if (count % 3 == 0 && count != 0) {
                    amountWithAccountingFormat.append(" ");
                }
                amountWithAccountingFormat.append(amount % 10);
                amount /= 10;
                count++;
            }
            amountWithAccountingFormat.append("-");
        } else {
            for (long i = 0; i < temporary.length(); i++) {
                if (count % 3 == 0 && count != 0) {
                    amountWithAccountingFormat.append(" ");
                }
                amountWithAccountingFormat.append(amount % 10);
                amount /= 10;
                count++;
            }
        }
        return new StringBuilder(amountWithAccountingFormat.toString()).reverse().toString();
    }
}
