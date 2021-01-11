package com.rakovets.course.java.core.practice.math;


/**
 * Разработать программу для метеологической станции:
 * которая переводит значения температуры в градусах Цельсия в Кельвины и Фаренгейты.
 *
 * @param temperatureInCelsius - температура в Цельсиях
 * @return формат вывода: 'Celsius {c}° - Kelvin {k}° - Fahrenheit {f}°'
 * где {c} - температура в Цельсиях и т.д.
 */
class Task06 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        double temperatureInCelsius = 0;

        // Код необходимый для тестирования, не изменять
        temperatureInCelsius = (args.length == 1) ? Double.parseDouble(args[0]) : temperatureInCelsius;

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
    }
}
