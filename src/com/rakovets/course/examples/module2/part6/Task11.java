package com.rakovets.course.examples.module2.part6;

/**
 * Класс математических функций и констант - Math
 */
public class Task11 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/************* константы *******************/

		double pi = Math.PI;
		System.out.println("Pi = " + pi);
		System.out.println("Экспанента = " + Math.E);

		/**
		 * тригонометрические функции в качестве значений принимаю градусы в
		 * радианах
		 **/

		// преобразование градусов в радианы
		double rad180 = Math.toRadians(180);
		System.out.println("180 радиан = " + rad180);

		// преобразование радианов в градусы
		System.out.println(rad180 + " радиан это " + Math.toDegrees(rad180) + " градусов");

		// косинус угла
		double cos180 = Math.cos(rad180);
		// System.out.println("косинус 180 = " + cos180);

		// синус угла
		double sin90 = Math.sin(Math.toRadians(90));
		// System.out.println("синус 90 = " + sin90);

		// тангенс угла
		double tan = Math.tan(Math.toRadians(45));
		// System.out.println("тангенс 45" + tan);

		double atan = Math.atan(Math.toRadians(45));
		// System.out.println("арк тангенс 45" + atan);

		double asin = Math.asin(Math.toRadians(45));
		// System.out.println("арк синус 45" + asin);

		double acos = Math.acos(Math.toRadians(45));
		// System.out.println("арк косинус 45" + acos);

		// Возвращает угол преобразования прямоугольных координат (х, у) в
		// полярных координатах (г, тета).
		double atan2 = Math.atan2(rad180, rad180);
		// System.out.println("арк косинус 45" + atan2);

		// логорифм
		double log = Math.log(12);
		// System.out.println("логорифм = " + log);

		// десятичный логорифм
		log = Math.log10(12);
		// System.out.println("десятичный логорифм = " + log);
	}
}