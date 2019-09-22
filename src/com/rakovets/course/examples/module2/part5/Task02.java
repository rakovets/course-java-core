package com.rakovets.course.examples.module2.part5;

/**
 * Литерал - это фиксированное значение в коде программы
 */
public class Task02 {
	public static void main(String[] args) {
		// Строка НЕ скомпилируется так как 3.2 является литералом типа double
		// float f1 = 3.2;

		float f2 = 0.5f; // литерал типа float
		System.out.println(f2);
		float f3 = .5f; // ноль можно не писать
		System.out.println(f3);
	}
}