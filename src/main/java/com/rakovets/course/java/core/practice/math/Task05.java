package com.rakovets.course.java.core.practice.math;

import com.rakovets.course.java.core.util.NumberUtil;

/**
 * Разработать программу для NASA.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task05 {
    /**
     * The entry point of the task.
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя.
        int encoderDegrees = 258;
        int tireRadius = 3;

        double tripDistance = getTripDistance(encoderDegrees, tireRadius);

        System.out.printf("Result: %b", tripDistance);
    }

    /**
     * Рассчитывает расстояние текущей поездки для ровер. Показания энкодера сбрасываются в начале каждой поездки.
     * Энкодера - это датчик угловых или линейных перемещений. Показания энкодера - это количество градусов которое
     * совершило устройство, которое использует данный датчик.
     *
     * @param encoderDegrees показания энкодера после поездки
     * @param tireRadius     радиус колеса
     */
    public static double getTripDistance(int encoderDegrees, int tireRadius) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя переменные объявленные выше (их можно изменять).
        // Для проверки решения необходимо запустить @Test для данного class (в директории test).
        return NumberUtil.roundValueToTwoDigitsForMantissa(0.0);
    }
}
