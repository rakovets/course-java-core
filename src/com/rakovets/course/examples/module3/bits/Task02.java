package com.rakovets.course.examples.module3.bits;


import static com.rakovets.course.examples.module3.util.helper.Binary.printToBinary;

/**
 * Побитовое представления числа, в раздичных системах счисления
 */
public class Task02 {
	public static void main(String[] args) {
		short x1 = 0xF0;
		System.out.println("Двоичное представлени числа в шестнадцатеричной системе");
		printToBinary(x1);
		System.out.println();
		// FIXME поменяй значение переменной x1 таким образом чтобы на консоль
		// было выведено чсло 0001111000011110000111100001111
		short x2 = 070;
		System.out.println("Двоичное представлени числа в восмеричной системе");
		printToBinary(x2);
		//FIXME поменяй значение переменной x2 таким образом чтобы на консоль
		// было выведено число 00111000111000111000111000111000
	}
}