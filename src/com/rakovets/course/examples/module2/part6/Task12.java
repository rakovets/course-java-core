package com.rakovets.course.examples.module2.part6;

/**
 * Видимость переменых ограничена блоком кода
 */
public class Task12 {
	public static void main(String[] args) {
		int i = 3;
		{
			int j = 5;
			System.out.println(i + j);
		}
		System.out.println(i);
		// FIXME раскоментирую 17 строчку кода
		// переменнаю с именем j в этой строчке не видна
		// System.out.println(i + j);
	}
}