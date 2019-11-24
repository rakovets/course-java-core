package com.rakovets.course.challenge.generics;

/**
 * Specification of task 1
 * Реализуйте шаблонный метод, который возвращает максимум из трёх переданных параметров.
 */

class Task01 {
	static <T extends Comparable<T>> T searchMaximumParameter(T num1, T num2, T num3) {
		if (num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
			return num1;
		} else if (num2.compareTo(num3) > 0) {
			return num2;
		} else return num3;
	}
}