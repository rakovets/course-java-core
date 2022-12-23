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
        int currentHealthPoint = 99;
        int maxHealthPoint = 200;

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
        final int percent = 100;
        int hpNowPercent = maxHealthPoint / percent * currentHealthPoint;
        if (hpNowPercent > 0 & hpNowPercent <25) {
            String percent25 = "RED";
            return percent25;
        } else if (hpNowPercent >= 25 & hpNowPercent < 50) {
            String percent50 = "ORANGE";
            return percent50;
        } else if (hpNowPercent >= 50 & hpNowPercent < 75) {
            String percent75 = "YELLOW";
            return percent75;
        } else if (hpNowPercent >= 75 & hpNowPercent <= 100) {
            String percent100 = "GREEN";
            return percent100;
        }
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        return null;
    }
}
