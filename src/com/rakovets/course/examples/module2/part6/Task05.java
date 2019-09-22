package com.rakovets.course.examples.module2.part6;

/**
 * Логические операции. В логических операциях операнды числа или арифметические
 * выражения, результат значение тип boolean
 */
public class Task05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int x1 = 5, x2 = 5, x3 = 3, x4 = 7;
		// круглые скобки нужны здесь только для отделения логической операции
		// от присваивания
		boolean isEqual = (x1 == x2); // сравнение
		System.out.println(isEqual);

		boolean isNonEqual = (x1 != x2); // проверка на неравенство
		System.out.println(isNonEqual);

		boolean isGreater = (x1 > x3); // x1 больше x3
		System.out.println(isGreater);

		boolean sGreaterOrEqual = (x2 >= x3); // больше или равно
		System.out.println(sGreaterOrEqual);

		boolean isLess = (x3 < x1); // меньше
		System.out.println(isLess);

		boolean isLessOrEqual = (x1 <= x3); // меньше или равно
		System.out.println(isLessOrEqual);

		// int t = x3==x4;
	}
}