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
    private final static int TWENTY_FIVE_PERCENT = 25;
    private final static int FIFTY_PERCENT = 50;
    private final static int SEVENTY_FIVE_PERCENT = 75;
    private final static int ONE_HUNDRED_PERCENT = 100;
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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        int onePercent =  maxHealthPoint / ONE_HUNDRED_PERCENT;
        int currentPercent = currentHealthPoint / onePercent;
        if (currentPercent <= 0 || currentPercent > ONE_HUNDRED_PERCENT) {
            return null;
        } else if (currentPercent < TWENTY_FIVE_PERCENT) {
            return "RED";
        } else if (currentPercent < FIFTY_PERCENT) {
            return "ORANGE";
        } else if (currentPercent < SEVENTY_FIVE_PERCENT) {
            return "YELLOW";
        } else {
            return "GREEN";
        }
    }
}
