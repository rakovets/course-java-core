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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int numberOfGasStation = 0;
        int fuelReservesIsEqual = 1;
            // нормально ли оставлять такие комментарии между условиями
            // compare to each other
        if (firstFuelReserves < secondFuelReserves && firstFuelReserves < thirdFuelReserves) {
            numberOfGasStation = 1;
        } else if (secondFuelReserves < firstFuelReserves && secondFuelReserves < thirdFuelReserves) {
            numberOfGasStation = 2;
        } else if (thirdFuelReserves < firstFuelReserves && thirdFuelReserves < secondFuelReserves) {
            numberOfGasStation = 3;
            //  compare when all reserves equals
        } else if  (firstFuelReserves == secondFuelReserves && firstFuelReserves < thirdFuelReserves) {
            numberOfGasStation = 1;
            //  compare when pair equals
        } else if (firstFuelReserves == thirdFuelReserves && firstFuelReserves < secondFuelReserves) {
            numberOfGasStation = 1;
        } else if (secondFuelReserves == thirdFuelReserves && secondFuelReserves < firstFuelReserves) {
            numberOfGasStation = 2;
        } else if (firstFuelReserves == secondFuelReserves && firstFuelReserves > thirdFuelReserves) {
            numberOfGasStation = 3;
        } else if (firstFuelReserves == secondFuelReserves && secondFuelReserves == thirdFuelReserves) {
            numberOfGasStation = fuelReservesIsEqual; }


            return numberOfGasStation;

    }
}
