package com.rakovets.course.examples.module2.part6;

/**
 * Операции с операндами типа boolean. Булевые операции. Операнды булевые
 * значения, результат булевое значение
 */
public class Task06 {
	public static void main(String[] args) {
		boolean isInRange, isValid, isNotValid, isEqual;
		int x = 8;
		isInRange = x > 0 & x < 5; // логическое И (AND)
		System.out.println("&" + isInRange);

		isInRange = x > 0 && x < 5;// логическое И быстрой оценки
		System.out.println("&&" + isInRange);

		isValid = x > 0 | x > 5; // логическое ИЛИ (OR)
		System.out.println(isValid);

		isValid = x > 0 || x > 5;// ленивое ИЛИ быстрой оценки
		System.out.println("|| " + isValid);

		isValid = (x != 8) ^ isInRange;// исключающее ИЛИ (XOR)
		System.out.println("^ " + isValid);

		/***************************************/
		isNotValid = !isValid;// логическое отрицание (NOT)
		System.out.println(isNotValid);

		isEqual = isInRange == isValid; // сравненеи
		System.out.println(isEqual);

		boolean isNotEqual = isInRange != isValid; // не равно
		System.out.println(isNotEqual);
	}
}