package com.rakovets.course.challenge.tasks_exception_handling;

public class Task02 {
	public static void main(String[] args) {
		int[] array = new int[2];
		try {
			array[100] = 7;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("\nException handling. Вылет за пределы массива: ");
			ex.printStackTrace();
		}
		System.out.println("Программа завершена");
	}
}