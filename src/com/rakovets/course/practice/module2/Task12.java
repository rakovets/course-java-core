package com.rakovets.course.practice.module2;

/**
 * Разработать программу для игрового движка:
 * которая высчитывает сколько времени пользователь провел в игре, если известно
 *
 * @param playingTimeInSeconds - количество секунд проведенных пользователем в игре
 *
 * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
 */
public class Task12 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int playingTimeInSeconds = 156;

		// Код необходимый для тестирования, не изменять
		playingTimeInSeconds = (args.length == 1) ? Integer.valueOf(args[0]) : playingTimeInSeconds;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int seconds = playingTimeInSeconds % 60;
		playingTimeInSeconds = playingTimeInSeconds / 60;
		int minuts = playingTimeInSeconds % 60;
		playingTimeInSeconds = playingTimeInSeconds / 60;
		int hours = playingTimeInSeconds % 24;
		int days = playingTimeInSeconds / 24;
		System.out.println(days + " " + hours + ":" + minuts + ":" + seconds);
	}
}