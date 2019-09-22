package com.rakovets.course.examples.module2.part5;

/**
 * Литерал - это фиксированное значение в коде программы
 */
public class Task01 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 2 является литералом типа int, тут происходит неявное преобразование типов
		long l1 = 2;
		// System.out.println(i1);
		l1 = 2L;
		l1 = 1l; // плохая практика, маленькая l похоже на 1
		// System.out.println(l1);

		// данный литерал не скомпилируется без указания типа long
		l1 = 999999999999999990L;
	}
}