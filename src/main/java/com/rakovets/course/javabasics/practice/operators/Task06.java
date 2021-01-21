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
        final int SECONDS_IN_DAY = 86400;
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int playingTimeInSeconds = 156;

        // Код необходимый для тестирования, не изменять
        playingTimeInSeconds = (args.length == 1) ? Integer.parseInt(args[0]) : playingTimeInSeconds;

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int days = playingTimeInSeconds / SECONDS_IN_DAY;
        playingTimeInSeconds = playingTimeInSeconds - (days * 86400);
        int hours = playingTimeInSeconds / 3600;
        playingTimeInSeconds = playingTimeInSeconds - (hours * 3600);
        int minutes = playingTimeInSeconds / 60;
        playingTimeInSeconds = playingTimeInSeconds - (minutes * 60);
        System.out.print(days + " " + hours + ":" + minutes + ":" + playingTimeInSeconds);
    }
}
