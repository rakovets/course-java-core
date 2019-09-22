package com.rakovets.course.examples.module2.part6;

/**
 * Унарные операторы - инкремент и декримент
 */
public class Task00 {
	public static void main(String[] args) {
		int i = -1;
		i = -i; // унарный минус
		System.out.println(i);

		i = +i; // унарный плюс
		//System.out.println(i);

		i++; // постфиксный инкремент
		// System.out.println(i);

		i--;
		// System.out.println(i);

		i = i++; // постфиксный декремент
		// System.out.println(i);

		i = ++i; // лишняя операция, так как присваивание уже есть в операции инкремента
		// System.out.println(i);

		i = ~i;
		//System.out.println(i);

		i = i++ + ++i; // головоломка
		//System.out.println(i);
	}
}