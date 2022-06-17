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
        long number = Math.abs(amount);

        StringBuilder accountingFormat = new StringBuilder();

        if (amount == 0) {
            accountingFormat.append(amount);
            return accountingFormat.toString();
        }
        for (int i = 0; number != 0; i++) {
            long remainderOfDivision = number % 1000;
            number /= 1000;
            if (i == 0) {
                accountingFormat.insert(0, remainderOfDivision);
            } else {
                accountingFormat.insert(0, remainderOfDivision + " ");
            }
        }
        if (amount < 0) {
            accountingFormat.insert(0, "-");
        }
        return accountingFormat.toString();
    }
}
