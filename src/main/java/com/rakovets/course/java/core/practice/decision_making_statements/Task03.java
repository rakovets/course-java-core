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
        final float PERCENTAGE = 100f;
        final byte PERCENTAGE_RED = 25;
        final byte PERCENTAGE_ORANGE = 50;
        final byte PERCENTAGE_YELLOW = 75;
        final byte PERCENTAGE_GREEN = 100;
        
        double getAPercentage = PERCENTAGE / ((double) maxHealthPoint / (double) currentHealthPoint);
        
        String colorHealthPoint;

        if (getAPercentage <= 0) {
            colorHealthPoint = null;
        } else if (getAPercentage < PERCENTAGE_RED) {
            colorHealthPoint = "RED";
        } else if (getAPercentage < PERCENTAGE_ORANGE) {
            colorHealthPoint = "ORANGE";
        } else if (getAPercentage < PERCENTAGE_YELLOW) {
            colorHealthPoint = "YELLOW";
        } else if (getAPercentage <= PERCENTAGE_GREEN) {
            colorHealthPoint = "GREEN";
        } else {
            colorHealthPoint = null;
        }
        return colorHealthPoint;
    }
}
