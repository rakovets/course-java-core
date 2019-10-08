package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для бухгалтерии:
 * Конвертировать чесловую сумму в сумму бухгалтерском формате, т.е. начиная справа, каждые три позиции отделяются
 * пробелом. Известно:
 * @param amount сумма
 * @return сумма в бухгалтерском формате
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task06 {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
		Scanner scanner = new Scanner(System.in);

		// Код необходимый для тестирования, не изменять
		long amount = (args.length!=1 ? scanner.nextLong():Long.parseLong(args[0]));

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
	}
}