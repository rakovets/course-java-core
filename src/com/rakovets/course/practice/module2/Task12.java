package com.rakovets.course.practice.module2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Разработать программу для игрового движка:
 * которая высчитывает сколько времени пользователь провел в игре, если известно
 *
 * playingTimeInSeconds - количество секунд проведенных пользователем в игре
 *
 * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
 */
public class Task12 {
	public static void main(String[] args) {
		//FIXME
		// Переменные, которые можно изменять для проверки различных вариантов входных параметров
		int playingTimeInSeconds = 0;

		// Код необходимый для тестирования, не изменять
		playingTimeInSeconds = (args.length == 1) ? Integer.parseInt(args[0]) : playingTimeInSeconds;

		//TODO
		// Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		Date date = new Date((long) (playingTimeInSeconds - 10800) * 1000);

		SimpleDateFormat dayFormat = new SimpleDateFormat("D");
		SimpleDateFormat timeFormat = new SimpleDateFormat("H:m:s");

		String day = dayFormat.format(date);
		String time = timeFormat.format(date);

		String formatedDate = Integer.parseInt(day) - 1 + " " + time;
		System.out.println(formatedDate);
	}
}