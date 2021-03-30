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
        long amount = -1500;

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
        String stringforsolution = "";
        int a = 1;
        if (amount < 0){
            amount *= -1;
            a = 0; }
        else if (amount == 0)
            return "0";
        for (int i = 1; amount > 0; i++){
            if (i % 3 == 0 && amount >= 10){
                stringforsolution = " " + amount % 10  + stringforsolution;
            }
            else {
                stringforsolution = amount % 10 + stringforsolution;
            }
            amount /= 10;

        }
        if (a == 0)
            stringforsolution = "-" + stringforsolution;

        return stringforsolution;
    }
}
