package com.rakovets.course.examples.module2.part6;

/**
 * Остаток от деления
 */
public class Task04 {
	public static void main(String[] args) {
		// 4 делим на 2
		int o = 4 % 2;
		System.out.println("4 mod 2 = " + o);

		// 3 делим на 2
		int o1 = 3 % 2;
		System.out.println("3 mod 2 = " + o1);

		// если знаменатель отрицательный то результат тоже отрицательный
		int o3 = -3 % 2;
		System.out.println("-3 mod 2 = " + o3);

		// если знаменатель положительный и делитель отрицательный то результат положительный
		int o4 = 3 % -2;
		System.out.println("3 mod -2 = " + o4);

		// если знаменатель больше делителя, то резульатат - это значение знаменателя
		int o5 = 5 % 10;
		System.out.println("5 mod 10 = " + o5);

		double у = 42.3;
		System.out.println("y mod 10 = " + у % 10);
	}
}