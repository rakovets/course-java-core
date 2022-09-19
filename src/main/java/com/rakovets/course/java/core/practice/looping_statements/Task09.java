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
        long amount = 1500876543L;

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
        String _toAccountingFormat = "";
        long _amount = amount;
        if (amount < 0) {
            _amount *= -1;
        }
        int lengthOfAmount = 0;
        int divider = 10;
        do {
            int currentNumber = (int) (_amount % divider);
            _toAccountingFormat = currentNumber + _toAccountingFormat;
            _amount = _amount / divider;
            lengthOfAmount++;
            if (lengthOfAmount % 3 == 0 && _amount > 0) {
                _toAccountingFormat = " " + _toAccountingFormat;
            }
        } while (_amount > 0);
        if (amount < 0) {
            _toAccountingFormat = "-" + _toAccountingFormat;
        }
        return _toAccountingFormat;
    }
}
