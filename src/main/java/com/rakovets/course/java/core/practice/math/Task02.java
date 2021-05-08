package com.rakovets.course.java.core.practice.math;

import com.rakovets.course.java.core.util.NumberUtil;

/**
 * Разработать программу для фабрики по производству квадратной плитки для мозаики.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task02 {
    /**
     * The entry point of the task.
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя.
        int weight = 9;

        double sideSize = getSideSize(weight);

        System.out.printf("Result: %b", sideSize);
    }

    /**
     * Рассчитывает размерность (т.е. размер стороны) квадратной плитки, которая находится на весах сортировочной ленты,
     * если известно что плитка площадью 1 кв.м. весит 1 кг.
     *
     * @param weight - вес плитки
     * @return размер стороны для квадратной плитки
     */
    public static double getSideSize(int weight) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя переменные объявленные выше (их можно изменять).
        // Для проверки решения необходимо запустить @Test для данного class (в директории test).
        return NumberUtil.roundValueToTwoDigitsForMantissa(0.0);
    }
}
