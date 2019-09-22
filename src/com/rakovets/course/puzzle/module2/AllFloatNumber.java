package com.rakovets.course.puzzle.module2;

/**
 * Числа типа float от 0 до 1
 */
public class AllFloatNumber {
	public static void main(String[] args) {
		float x = 1.0F;
		int numFloats = 0;
		while (x <= 2.0) {
			numFloats++;
			// System.out.println(x);
			x = Math.nextUp(x);
		}
		System.out.println(numFloats);
	}
}
