package com.rakovets.course.challenge.generics;

/**
 * Specification of task 2
 * Реализуйте шаблонный метод, который возвращает минимум из пяти переданных параметров.
 */

class Task02 {
	static <T extends Comparable<T>> T searchMinimumParameter(T num1, T num2, T num3, T num4, T num5) {
		if (num1.compareTo(num2) < 0 && num1.compareTo(num3) < 0 && num1.compareTo(num4) < 0 && num1.compareTo(num5) < 0) {
			return num1;
		} else if (num2.compareTo(num3) < 0 && num2.compareTo(num4) < 0 && num2.compareTo(num5) < 0) {
			return num2;
		} else if (num3.compareTo(num4) < 0 && num3.compareTo(num5) < 0) {
			return num3;
		} else if (num4.compareTo(num5) < 0) {
			return num4;
		} else return num5;
	}
}