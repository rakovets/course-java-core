package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для банка:
 * Необходимо расчитать прибыль, которую получит клиент по вкладу с ежегодным перерасчетом. Известно:
 * @param depositAmount сумма вклада
 * @param annualDepositPercent ежегодный процент вклада
 * @param depositTerm продолжительность вклада (в годах)
 * @return прибыль округленную математически
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
		Scanner scanner = new Scanner(System.in);

		// Код необходимый для тестирования, не изменять
		double depositAmount = (args.length!=3 ? scanner.nextDouble():Double.parseDouble(args[0]));
		double annualDepositPercent = (args.length!=3 ? scanner.nextDouble():Double.parseDouble(args[1]));
		int depositTerm = (args.length!=3 ? scanner.nextInt():Integer.parseInt(args[2]));

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
	}
}