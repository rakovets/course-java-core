package com.rakovets.course.puzzle.module2;

/**
 * Почему в результате получается false?
 * Исправь программу, сохранив логику
 */
public class OwerloadInt {
	public static void main(String[] args) {
		int x = 2_000_000_000 + 2_000_000_000 - 2_000_000_000;
		int y = (2_000_000_000 + 2_000_000_000) / 2;
		System.out.println(x == y);
	}
}