package com.rakovets.course.practice.module4;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Спрогнозировать какое количество HP будет у RaidBoss, который имеет неограниченое количество HP и регенерацию,
 * которая пропорционально зависит от его текущего количества HP. Известно:
 * @param healthPoints количество HP Raid Boss после появления (respawn)
 * @param regenerationPercentFromCurrentHealth регенерация здоровья (процент / час)
 * @param hoursAfterRespawn время прошедшее после появления Raid Boss
 * @return количество HP
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task04 {
	public static void main(String[] args) {
		// Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров
		Scanner scanner = new Scanner(System.in);

		// Код необходимый для тестирования, не изменять
		int healthPoints = (args.length!=3) ? scanner.nextInt():Integer.parseInt(args[0]);
		double regenerationPercentFromCurrentHealth = (args.length!=3) ? scanner.nextDouble():Double.parseDouble(args[1]);
		double hoursAfterRespawn = (args.length!=3) ? scanner.nextDouble():Double.parseDouble(args[2]);

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		double result = healthPoints;
		while(hoursAfterRespawn > 0){
			result = result + result * regenerationPercentFromCurrentHealth / 100;
			hoursAfterRespawn--;
		}
		System.out.println((int)result);
	}
}