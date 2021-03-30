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
        long amount = 10000000;

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

        String rightFormat = "";
        int divider = 1000;
        long result = 0L;

        if ( amount > 0) {

            for (long a = amount; a > 0 ; a /= divider) {

                if (a == amount) {
                     if (a % divider != 0) {
                         result = a % divider;
                         rightFormat += result;
                    } else {
                        rightFormat = "000" + " " + rightFormat;
                    }

                }else if (a % divider != 0) {
                    result = a % divider;
                    rightFormat = result + " " + rightFormat;
                } else {
                    rightFormat = "000" + " " + rightFormat;
                }

            }

        } else if (amount < 0) {
            amount *= -1;

            for (long a = amount; a > 0; a /= divider) {

                if (a == amount){
                    result = a % divider;
                    rightFormat += result;
                }else if (a % divider != 0) {
                    result = a % divider;
                    rightFormat = result + " " + rightFormat;
                } else {
                    rightFormat = "000" + " " + rightFormat;
                }

            }

            rightFormat = "-" + rightFormat;

        } else {
            rightFormat += result;
        }

        return rightFormat;
    }
}
