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
		int playingTimeInSeconds = 1000;

		// Код необходимый для тестирования, не изменять
		playingTimeInSeconds = (args.length == 1) ? Integer.valueOf(args[0]) : playingTimeInSeconds;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		int day = playingTimeInSeconds/86400;
		int ostday = playingTimeInSeconds%86400;
		int hour = playingTimeInSeconds/3600;
		int osthour = playingTimeInSeconds%3600;
		int min = playingTimeInSeconds/60;
		int ostmin = playingTimeInSeconds%60;
		int sec = playingTimeInSeconds/1;
		int ostsec = playingTimeInSeconds%1;
		System.out.println(day+" "+hour+":"+min+":"+ostmin);
	}
}