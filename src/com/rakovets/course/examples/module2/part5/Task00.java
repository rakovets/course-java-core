package com.rakovets.course.examples.module2.part5;

/**
 * Литерал - это фиксированное значение в коде программы
 */
public class Task00 {
	public static void main(String[] args) {
		// число 10 это и есть литерал
		int i0 = 10;
		System.out.println(i0);

		// число 8 записаное литералом в восмеричной системе счисления
		int i1 = 010;
		System.out.println(i1);

		// число 16 записаное литералом в шестнадцатеричной системе счисления
		int i2 = 0x10;
		System.out.println(i2);

		// число 2 записанное литералом в двоичной системе счисления появился в
		// версии java 1.7
		int i3 = 0b10;
		System.out.println(i3);
	}
}