package com.rakovets.course.javabasics.practice.loops;

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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        String number = String.valueOf(amount);
        String numberReverse = "";
        int i0 = 0;
        if (amount < 0 ){
            i0 = 1;
        }

        for (int i = number.length() - 1; i >= i0; i--) {
            numberReverse += number.charAt(i);
        }

        String returnStrReverse = "";
        int count = 0;
        for (int i = 0; i < numberReverse.length(); i++) {
            count++;
            returnStrReverse += numberReverse.charAt(i);
            if (count % 3 == 0 && i < numberReverse.length() - 1) {
                count = 0;
                returnStrReverse += " ";
            }
        }
        String returnStr = "";
        if (amount < 0 ) {
            returnStr += "-";
        }
        for (int i = returnStrReverse.length() - 1; i >= 0; i--) {
            returnStr += returnStrReverse.charAt(i);
        }

        return returnStr;
    }
}
