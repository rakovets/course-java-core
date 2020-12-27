package com.rakovets.course.javabasics.practice.operators;

/**
 * Разработать программу для игрового движка:
 * которая высчитывает сколько времени пользователь провел в игре, если известно
 *
 * @param playingTimeInSeconds - количество секунд проведенных пользователем в игре
 * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
 */
public class Task06 {
    public static void main(String[] args) {
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int playingTimeInSeconds = 1000000;

        // Код необходимый для тестирования, не изменять
        playingTimeInSeconds = (args.length == 1) ? Integer.parseInt(args[0]) : playingTimeInSeconds;

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int playDay = playingTimeInSeconds / 86400;
        int playHour = (playingTimeInSeconds % 86400) / 3600;
        int playMinutes = (playingTimeInSeconds % 86400) % 3600 / 60;
        int playSeconds = playingTimeInSeconds - ((playMinutes*60) + (playHour*3600) + (playDay * 86400));
        System.out.print(playDay + " ");
        System.out.print(playHour + ":");
        System.out.print(playMinutes + ":");
        System.out.print(playSeconds);
    }
}
