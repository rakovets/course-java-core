package com.rakovets.course.practice.module2;

/**
 * Разработать программу для фитнес приложения:
 * которая расчитывает избыточность веса пользователя от стандартного веса для его роста (стандартного вес = рост - 110).
 * Если известно:
 *
 * @param height - рост
 * @param weight - вес
 */
public class Task10 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int height = 186;
		int weight = 86;

		// Код необходимый для тестирования, не изменять
		height = (args.length == 2) ? Integer.valueOf(args[0]) : height;
		weight = (args.length == 2) ? Integer.valueOf(args[1]) : weight;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int standartVes = height - 110;
		int izbitVes = weight - standartVes;
		System.out.println(izbitVes);
	}
}
