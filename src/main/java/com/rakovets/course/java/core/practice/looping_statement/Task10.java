package com.rakovets.course.java.core.practice.looping_statement;

/**
 * Разработать программу для математического калькулятора, которая находит количество простых чисел в промежутке.
 *
 * <ul>
 *     <li>Число называется простым, если оно делится на цело (без остатка) ТОЛЬКО на 1 и на себя.</li>
 *     <li>1 не является простым числом</li>
 * </ul>
 * <p>
 * * Программа должна работать максимально эффективно, т.е. количество команд выполняемых CPU должно быть минимально
 * (тем самым уменьшится и время выполнения).
 *
 * @author Dmitry Rakovets
 */
class Task10 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int startNumber = 1;
        int finishNumber = 29;

        int countPrimeNumber = countPrimeNumber(startNumber, finishNumber);
        System.out.printf("Result:\n%d", countPrimeNumber);
    }

    /**
     * Возвращает количество простых чисел в заданном промежутке.
     *
     * @param startNumber  начало промежутка (включая)
     * @param finishNumber конец промежутка (включая)
     * @return количество простых чисел
     */
    static int countPrimeNumber(int startNumber, int finishNumber) {
        int counOfnumbers = 0;
        int countOfDivider = 1;

        if (startNumber <= 1) {
            startNumber = 2;
        }

        for (int i = startNumber; i <= finishNumber; i++) {
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    countOfDivider++;
            }
            if (countOfDivider <= 2) {
                counOfnumbers = counOfnumbers + 1;
                countOfDivider = 1;
            }
            countOfDivider = 1;
        }

        return counOfnumbers;
    }
}

