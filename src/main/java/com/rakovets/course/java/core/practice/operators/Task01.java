package com.rakovets.course.java.core.practice.operators;

/**
 * Разработать программу для логистического центра.
 *
 * @author Dmitry Rakovets
 */
class Task01 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int cargo = 11;
        int carryingCapacity = 2;

        int numberFullTrucks = getNumberFullTrucks(cargo, carryingCapacity);
        System.out.printf("Result: %d", numberFullTrucks);
    }

    /**
     * Рассчитывает количество полностью загруженных грузовиков, необходимых для перевозки некоторого груза.
     *
     * @param cargo            вес всего груза
     * @param carryingCapacity грузоподъемность грузовиков
     */
    static int getNumberFullTrucks(int cargo, int carryingCapacity) {
        return cargo/carryingCapacity;
    }
}
