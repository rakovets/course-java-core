package com.rakovets.course.java.core.practice.decision_making_statements;

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
        int currentHealthPoint = 10;
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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        final double PERCENTAGE = 100D;
        final int RED_PERCENT = 25;
        final int ORANGE_PERCENT = 50;
        final int YELLOW_PERCENT = 75;
        final int GREEN_PERCENT = 100;

        String colorHealthPoint;
        double checkPercent = currentHealthPoint * PERCENTAGE / maxHealthPoint;
        if (checkPercent <= 0) {
            colorHealthPoint = null;
        } else if (checkPercent < RED_PERCENT) {
            colorHealthPoint = "RED";
        } else if (checkPercent < ORANGE_PERCENT) {
            colorHealthPoint =  "ORANGE";
        } else if (checkPercent < YELLOW_PERCENT) {
            colorHealthPoint =  "YELLOW";
        } else if (checkPercent <= GREEN_PERCENT) {
            colorHealthPoint =  "GREEN";
        } else {
            colorHealthPoint =  null;
        }
        return colorHealthPoint;
    }
}
