package com.rakovets.course.practice.module2;

/**
 * Разработать программу для логистического центра:
 * которая будет раcчитывать количество полностью загруженны грузовиков, необходимых
 * для перевозки некоторого груза, если известно:
 *
 * @param cargo            - вес всего груза
 * @param carryingCapacity - грузоподъемность грузовиков
 */
public class Task01 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int cargo = 10;
		int carryingCapacity = 2;

		// Код необходимый для тестирования, не изменять
		cargo = (args.length == 0) ? cargo : Integer.valueOf(args[0]);
		carryingCapacity = (args.length == 0) ? carryingCapacity : Integer.valueOf(args[1]);

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		System.out.println(cargo / carryingCapacity);
	}
}