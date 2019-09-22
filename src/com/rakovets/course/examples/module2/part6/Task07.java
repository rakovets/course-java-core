package com.rakovets.course.examples.module2.part6;

/**
 * Тернарный оператор - это оператор, который возвращает значения одного из
 * выражений
 */
public class Task07 {
	public static void main(String[] args) {
		int x = 3;

		int t = x > 3 ? 1 : 0;
		System.out.println(t);

		t = (x < 3) ? x++ : --x; // добавляй скобки для выражений в первом
		// операнде
		// System.out.println(t);

		t = 10 + (x < 3 ? x++ : --x);
		// System.out.println(t);

		t = 10 + (x < 3 ? (x > 10 ? x / 2 : x * 2) : --x);
		// System.out.println(t);
	}
}