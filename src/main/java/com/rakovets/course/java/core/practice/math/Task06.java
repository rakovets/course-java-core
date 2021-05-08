package com.rakovets.course.java.core.practice.math;

import com.rakovets.course.java.core.util.NumberUtil;

/**
 * Разработать программу для метеорологической станции.
 *
 * @author Dmitry Rakovets
 */
@SuppressWarnings("unused")
class Task06 {
    /**
     * The entry point of the task.
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя.
        double temperatureInCelsius = 0;

        String temperatures = conversionTemperature(temperatureInCelsius);

        System.out.printf("Result: '%b'", temperatures);
    }

    /**
     * Переводит значения температуры в градусах Цельсия в градусы Кельвина и Фаренгейта.
     *
     * @param temperatureInCelsius - температура в Цельсиях
     * @return формат вывода: `Celsius {c}° - Kelvin {k}° - Fahrenheit {f}°`, где `{c}` - температура в Цельсиях и т.д.
     */
    public static String conversionTemperature(double temperatureInCelsius) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя переменные объявленные выше (их можно изменять).
        // Для проверки решения необходимо запустить @Test для данного class (в директории test).
        NumberUtil.roundValueToTwoDigitsForMantissa(0.0);
        return "";
    }
}
