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
        String colorForHealthPoint;
        if (currentHealthPoint == 0) {
            colorForHealthPoint = null;
        } else {
            float percentOfHealthPoint = (float) currentHealthPoint / maxHealthPoint * 100;
            if (percentOfHealthPoint > 0 && percentOfHealthPoint < 25) {
                colorForHealthPoint = "RED";
            } else if (percentOfHealthPoint >= 25 && percentOfHealthPoint < 50) {
                colorForHealthPoint = "ORANGE";
            } else if (percentOfHealthPoint >= 50 && percentOfHealthPoint < 75) {
                colorForHealthPoint = "YELLOW";
            } else if (percentOfHealthPoint >= 75 && percentOfHealthPoint <= 100) {
                colorForHealthPoint = "GREEN";
            } else {
                colorForHealthPoint = null;
            }
        }
        return colorForHealthPoint;
    }
}
