package com.rakovets.course.java.core.practice.decision_making_statement;

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
        int currentHealthPoint = 76;
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

        String colorHealthPoint;

        if (currentHealthPoint > 0) {

            if (currentHealthPoint < 0.25 * maxHealthPoint) {
                colorHealthPoint = "RED";
            } else if (currentHealthPoint < 0.5 * maxHealthPoint) {
                colorHealthPoint = "ORANGE";
            } else if (currentHealthPoint < 0.75 * maxHealthPoint) {
                colorHealthPoint = "YELLOW";
            } else if (currentHealthPoint <= maxHealthPoint) {
                colorHealthPoint = "GREEN";
            } else {
                colorHealthPoint = null;
            }

        } else {
            colorHealthPoint = null;
        }

        return colorHealthPoint;
    }
}
