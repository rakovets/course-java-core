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
        long amount = -77123;

        String amountWithAccountingFormat = convertToAccountingFormat(amount);
        System.out.printf("Result:%s", amountWithAccountingFormat);
    }

    /**
     * Конвертировать числовую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
     * пробелом.
     *
     * @param amount сумма
     * @return сумма в бухгалтерском формате
     */
    static String convertToAccountingFormat(long amount) {
        if ( amount == 0 ) {
            return "0";
        }
        String amountMinus = "";
        if ( amount < 0 ) {
            amountMinus = "-";
            amount = Math.abs(amount);
        }
        String convertToAccountingFormat ="";
        String textAmount = Long.toString(amount);
        while ( amount > 0 ) {
            convertToAccountingFormat =  amount % 1000 + convertToAccountingFormat;
            amount /= 1000;
            if ( amount > 0 ){
                convertToAccountingFormat = " " + convertToAccountingFormat;
            }
        }
        convertToAccountingFormat = amountMinus + convertToAccountingFormat;
        return convertToAccountingFormat;
    }
}
