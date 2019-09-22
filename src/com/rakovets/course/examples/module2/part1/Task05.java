package com.rakovets.course.examples.module2.part1;

/**
 * Объявление констант в коде
 */
public class Task05 {
	public static void main(String[] args) {
		// ключевое слово final указывает, что переменная с именем const1 будет
		// являться константой и ее значение невозможно будет изменить в
		// дальнейшем коде.
		final int const1 = 5;
		// const1 = 3; // нельзя изменить значенеи
		System.out.println(const1);
	}
}