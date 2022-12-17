package com.rakovets.course.java.core.practice.operators;

import com.rakovets.course.java.core.util.constants.LimitValues;
import com.rakovets.course.java.core.util.random_util.RandomUtil;

/**
 * Разработать программу для логистического центра.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        RandomUtil randomUtil = new RandomUtil();
        int cargo = randomUtil.getRandomIntegerNumber(LimitValues.HUNDREDS.getLimitValue());
        int carryingCapacity = randomUtil.getRandomIntegerNumber(LimitValues.TENS.getLimitValue());

        int amountRemainingCargo = getAmountRemainingCargo(cargo, carryingCapacity);
        System.out.printf("Result: %d", amountRemainingCargo);
    }

    /**
     * Рассчитывает количество некоторого груза, который останется на складе, после полной загрузки его в грузовики, т.е.
     * грузовики должны быть загружены полностью
     *
     * @param cargo            вес всего груза
     * @param carryingCapacity грузоподъемность грузовиков
     */
    static int getAmountRemainingCargo(int cargo, int carryingCapacity) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return cargo % carryingCapacity;
    }
}
