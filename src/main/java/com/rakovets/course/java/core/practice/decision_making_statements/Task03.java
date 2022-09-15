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
        String colorHealth = null;
        if (currentHealthPoint > 0 && currentHealthPoint <= maxHealthPoint) {
            if (currentHealthPoint > 0 && currentHealthPoint < (maxHealthPoint * 25 / 100)) {
                colorHealth = "RED";
            } else if (currentHealthPoint >= (maxHealthPoint * 25 / 100) && currentHealthPoint < (maxHealthPoint * 50 / 100)) {
                colorHealth = "ORANGE";
            } else if (currentHealthPoint >= (maxHealthPoint * 50 / 100) && currentHealthPoint < (maxHealthPoint * 75 / 100)) {
                colorHealth = "YELLOW";
            } else if (currentHealthPoint >= (maxHealthPoint * 75 / 100) && currentHealthPoint <= maxHealthPoint) {
                colorHealth = "GREEN";
            }
        }
        return colorHealth;
    }
}
