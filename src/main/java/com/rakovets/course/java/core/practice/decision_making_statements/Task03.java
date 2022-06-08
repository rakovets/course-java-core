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
        int currentHealthPoint = 0;
        int maxHealthPoint = 346;

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
        float remainingHealthPercent;

        remainingHealthPercent = (float) (currentHealthPoint * 100) / maxHealthPoint;

        if (remainingHealthPercent > 0 && remainingHealthPercent < 25) {
            colorHealthPoint = "RED";
        } else if (remainingHealthPercent >= 25 && remainingHealthPercent < 50) {
            colorHealthPoint = "ORANGE";
        } else if (remainingHealthPercent >= 50 && remainingHealthPercent < 75) {
            colorHealthPoint = "YELLOW";
        } else if (remainingHealthPercent >= 75 && remainingHealthPercent <= 100) {
            colorHealthPoint = "GREEN";
        } else {
            colorHealthPoint = null;
        }

        return colorHealthPoint;
    }
}
