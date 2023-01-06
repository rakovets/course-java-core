package com.rakovets.course.java.core.practice.looping_statements;

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
        int startNumber = 0;
        int finishNumber = 50;

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
        int countNumber = 0;

        if (startNumber < 2) {
            startNumber = 2;
        }
        for (int i = startNumber; i <= finishNumber; i++) {
            if (checkSimple(i)) {
                countNumber++;
            }
        }
        return countNumber;
    }

    static boolean checkSimple(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
