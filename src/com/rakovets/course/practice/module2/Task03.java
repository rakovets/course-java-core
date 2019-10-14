package com.rakovets.course.practice.module2;

/**
 * Разработать программу для игрового движка:
 * которая выводит штрафные очки игрока, который набрал меньше штрафных очков, если известно:
 *
 * @param penaltyPointFirstPlayer  - штрафные очки первого игрока
 * @param penaltyPointSecondPlayer - штрафные очки второго игрока
 */
public class Task03 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int penaltyPointFirstPlayer = 1;
		int penaltyPointSecondPlayer = 2;

		// Код необходимый для тестирования, не изменять
		penaltyPointFirstPlayer = (args.length == 0) ? penaltyPointFirstPlayer : Integer.parseInt(args[0]);
		penaltyPointSecondPlayer = (args.length == 0) ? penaltyPointSecondPlayer : Integer.parseInt(args[1]);

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		if (penaltyPointFirstPlayer < penaltyPointSecondPlayer) {
			System.out.println(penaltyPointFirstPlayer);
		} else if (penaltyPointSecondPlayer < penaltyPointFirstPlayer) {
			System.out.println(penaltyPointSecondPlayer);
		}
	}
}