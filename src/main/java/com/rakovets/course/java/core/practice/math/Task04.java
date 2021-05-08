package com.rakovets.course.java.core.practice.math;

import com.rakovets.course.java.core.util.NumberUtil;

/**
 * Разработать программу для фабрики по производству зонтов.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task04 {
    /**
     * The entry point of the task.
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя.
        int diameter = 10;

        double materialArea = getMaterialArea(diameter);

        System.out.printf("Result: %b", materialArea);
    }

    /**
     * Рассчитает площадь материала необходимого для изготовления одного зонта. Для изготовления зонта используется
     * материал в форме круга.
     *
     * @param diameter - диаметр зонта.
     * @return площадь материала для зонта.
     */
    public static double getMaterialArea(int diameter) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя переменные объявленные выше (их можно изменять).
        // Для проверки решения необходимо запустить @Test для данного class (в директории test).
        return NumberUtil.roundValueToTwoDigitsForMantissa(0.0);
    }
}
