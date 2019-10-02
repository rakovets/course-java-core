package com.rakovets.course.practice.module2;


/**
 * Разработать программу для метеологической станции:
 * которая переводит значения температуры в градусах Цельсия в Кельвины и Фаренгейты.
 *
 * @param temperatureInCelsius - температура в Цельсиях
 *
 * @return формат вывода: Celsius ${c}° - Kelvin ${k}° - Fahrenheit ${f}°
 * где ${c} - температура в Цельсиях и т.д.
 */
public class Task11 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		double temperatureInCelsius = 0;

		// Код необходимый для тестирования, не изменять
		temperatureInCelsius = (args.length == 1) ? Double.valueOf(args[0]) : temperatureInCelsius;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		double k = temperatureInCelsius +273;
		double c = (5/9) * temperatureInCelsius + 32;
		final String DEGREE  = "\u00b0";
		System.out.println("Celsius" + " "+ temperatureInCelsius+DEGREE+" "+"- Kelvin "+k+DEGREE+" "+"- Fahrenheit "+c+DEGREE);
	}
}