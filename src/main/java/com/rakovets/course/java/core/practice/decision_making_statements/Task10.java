package com.rakovets.course.java.core.practice.decision_making_statements;

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
        int firstFuelReserves = 100;
        int secondFuelReserves = 50;
        int thirdFuelReserves = 70;

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
        int numberStation;
        if (firstFuelReserves <= secondFuelReserves & firstFuelReserves <= secondFuelReserves) {
            numberStation = 1;
        } else if (secondFuelReserves < firstFuelReserves & secondFuelReserves <= thirdFuelReserves) {
            numberStation = 2;
        } else if (thirdFuelReserves < firstFuelReserves & thirdFuelReserves < secondFuelReserves) {
            numberStation = 3;
        } else {
            numberStation = 1;
        }
        return numberStation;
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
    }
}
