package com.rakovets.course.java.core.practice.decision_making_statement;

/**
 * Разработать программу для сети АЗС.
 * <p>
 * Программа вычисляет на какую АЗС необходимо доставить топливо в первую очередь.
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
        int firstFuelReserves = 0;
        int secondFuelReserves = 0;
        int thirdFuelReserves = 0;

        int numberStation = getNumberStation(firstFuelReserves, secondFuelReserves, thirdFuelReserves);
        System.out.printf("Result: %s", numberStation);
    }

    /**
     * Программа вычисляет на какую АЗС необходимо доставить топливо в первую очередь.
     * Если количество запасов топлива наименьшее на нескольких АЗС, то вывести первую АЗС в порядке
     * возрастания номера АЗС.
     * Например: если на всех заправках одинаковое количество, то вернуть <code>1</code>
     *
     * @param firstFuelReserves  запасы топлива на первой заправке
     * @param secondFuelReserves запасы топлива на второй заправке
     * @param thirdFuelReserves  запасы топлива на третьей заправке
     * @return номер заправки.
     */
    static int getNumberStation(int firstFuelReserves, int secondFuelReserves, int thirdFuelReserves) {
        if (firstFuelReserves < secondFuelReserves && firstFuelReserves < thirdFuelReserves)
            return 1;
        if (secondFuelReserves < firstFuelReserves && secondFuelReserves < thirdFuelReserves)
            return 2;
        if (thirdFuelReserves < secondFuelReserves && thirdFuelReserves < firstFuelReserves)
            return 3;
        if (firstFuelReserves == secondFuelReserves || firstFuelReserves == 0)
            return 1;
        if (firstFuelReserves == thirdFuelReserves || firstFuelReserves == 0)
            return 1;
        if (secondFuelReserves == thirdFuelReserves || secondFuelReserves == 0)
            return  2;
        else
        return 0;
    }
}
