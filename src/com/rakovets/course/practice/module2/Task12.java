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
		playingTimeInSeconds = (args.length == 1) ? Integer.parseInt(args[0]) : playingTimeInSeconds;

		System.out.println(playingTimeInSeconds / 86400 + " " + playingTimeInSeconds / 3600 % 24 + ":" + playingTimeInSeconds / 60 % 60 + ":" + playingTimeInSeconds % 60 );


	}
}