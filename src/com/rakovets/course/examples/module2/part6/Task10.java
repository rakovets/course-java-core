package com.rakovets.course.examples.module2.part6;

/**
 * Класс математических функций и констант - Math
 */
public class Task10 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// математическое округления
		float f = 2.454f;
		int round = Math.round(f);
		// System.out.println(f + " округленное = " + round);

		// округление к большому
		double ceil = Math.ceil(3.4);
		// System.out.println("округленное к большому = " + ceil);

		// Округление в меньшую сторону
		System.out.println(Math.floor(3.9));
	}
}