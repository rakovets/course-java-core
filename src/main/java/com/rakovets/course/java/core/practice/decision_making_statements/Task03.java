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
        String color = "";
        final int HUNDRED_PERCENTS = 100;
        float currentHealthInPercents = (float) currentHealthPoint / maxHealthPoint * HUNDRED_PERCENTS;
        if (currentHealthPoint > 0 && currentHealthPoint <= maxHealthPoint) {
            if (currentHealthInPercents < 25.0f && currentHealthInPercents > 0.0f) {
                color = "RED";
            } else if (currentHealthInPercents < 50.0f && currentHealthInPercents >= 25.0f) {
                color = "ORANGE";
            } else if (currentHealthInPercents < 75.0f && currentHealthInPercents >= 50.0f) {
                color = "YELLOW";
            } else if (currentHealthInPercents <= 100.0f && currentHealthInPercents >= 75.0f) {
                color = "GREEN";
            } return color;
        } else {
            return null;
        }
    }
}
