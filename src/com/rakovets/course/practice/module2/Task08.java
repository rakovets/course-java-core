package com.rakovets.course.practice.module2;

/**
 * Разработать программу для NASA:
 * который определит растояние которое проехал робот. Показания энкодера сбрасываются в начале поездки. Известно:
 *
 * @param encoderDegrees - показания энкодера после поездки
 * @param tireRadius     - радиус колеса
 */
public class Task08 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int encoderDegrees = 3;
		int tireRadius = 1;

		// Код необходимый для тестирования, не изменять
		encoderDegrees = (args.length == 2) ? Integer.valueOf(args[0]) : encoderDegrees;
		tireRadius = (args.length == 2) ? Integer.valueOf(args[1]) : tireRadius;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		double fistZnak = 2 * Math.PI;
		double lColecaoleca = fistZnak * tireRadius;
		System.out.println(encoderDegrees / lColecaoleca);
	}
}