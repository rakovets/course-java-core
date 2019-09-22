package com.rakovets.course.examples.module3.bits;

import com.rakovets.course.examples.module3.util.helper.BitOperationViewer;

import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * Бинарное отрицание (инвертирование битов) (NOT)
 */
public class Task06 {
	public static void main(String[] args) {
		final int one = 123;
		printToBinary(one);
		System.out.println(" ~");
		int i = ~one; // NOT
		printToBinary(i);
		System.out.println(i);
		System.out.println();
		BitOperationViewer.main(new String[]{"NOT"});
	}
}