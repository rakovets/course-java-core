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
		int encoderDegrees = 258;
		int tireRadius = 3;

		// Код необходимый для тестирования, не изменять
		encoderDegrees = (args.length == 2) ? Integer.parseInt(args[0]) : encoderDegrees;
		tireRadius = (args.length == 2) ? Integer.parseInt(args[1]) : tireRadius;

		System.out.println(encoderDegrees / (tireRadius * 2  * Math.PI));


	}
}