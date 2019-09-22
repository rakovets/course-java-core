package com.rakovets.course.examples.module2.part6;

/**
 * Комбинированные операции включают в себя две операции. Служат в основном для
 * сокращения кода.
 */
public class Task08 {
	public static void main(String[] args) {
		int i = 2;
		i = i + 2;
		System.out.println(i);

		// int i1 =+i1; //ошибка так как переменная доступна только со следующей
		// команды.

		int i2 = 2;
		i2 += 2; // заменяет выражение i = i + 2;
		System.out.println(i2);

		i2 -= 5;
		i2 *= 2;
		i2 /= 2;
		i2 %= 2;

		i2 <<= 2;
		i2 >>= 3;
		i2 &= 5;
		i2 |= 7;
		i ^= 3;
	}
}