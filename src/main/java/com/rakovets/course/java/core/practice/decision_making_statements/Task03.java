package com.rakovets.course.java.core.practice.decision_making_statements;

import jdk.jfr.Percentage;

/**
 * Разработать программу для игрового движка.
 * <p>
 * Необходимо окрасить шкалу HP игрока в соответствующий цвет, в зависимости от процентного соотношения максимального
 * количества HP и текущего.
 *
 * @author Dmitry Rakovets
 */
class Task03 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int currentHealthPoint = 50;
        int maxHealthPoint = 100;

        String colorHealthPoint = getColorHealthPoint(currentHealthPoint, maxHealthPoint);
        System.out.printf("Result: %s", colorHealthPoint);
    }

    /**
     * Возвращает цвет для шкалы HP игрока, в зависимости от процентного соотношения максимального количества HP и
     * текущего. Когда меньше 25% - красный, меньше 50% - оранжевый, меньше 75% - желтый, меньше либо равно 100 -
     * зеленый.
     *
     * @param currentHealthPoint текущее количество HP игрока
     * @param maxHealthPoint     максимальное количество HP игрока
     * @return null/'RED'/'ORANGE'/'YELLOW'/'GREEN'
     */
    static String getColorHealthPoint(int currentHealthPoint, int maxHealthPoint) {
        double ratioBetweenMaxAndCurrent = (double) currentHealthPoint / maxHealthPoint * 100 ;
        System.out.println(ratioBetweenMaxAndCurrent);

         if (ratioBetweenMaxAndCurrent > 0 && ratioBetweenMaxAndCurrent < 25) {
           return "RED";
        } else if (ratioBetweenMaxAndCurrent >= 25 && ratioBetweenMaxAndCurrent < 50) {
           return "ORANGE";
       } else if (ratioBetweenMaxAndCurrent >= 50 && ratioBetweenMaxAndCurrent < 75) {
            return "YELLOW";
       } else if (ratioBetweenMaxAndCurrent >= 75 && ratioBetweenMaxAndCurrent <= 100) {
            return "GREEN";
        } else {
            return null;
        }
    }
}
