package com.rakovets.course.puzzle.module2;

public class QuickAssessment {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO меняй значения переменных a и b
		boolean a = true;
		boolean b = false;
		System.out.print("|| ");
		boolean x = a(a) || b(b);
		System.out.println();
		System.out.print("&& ");
		x = a(a) && b(b);
	}

	static boolean a(boolean a) {
		System.out.print("a ");
		return a;
	}

	private static boolean b(boolean b) {
		System.out.print("b ");
		return b;
	}
}