package com.rakovets.course.javabasics.practice.operators;

/**
 * Разработать программу для игрового движка:
 * которая высчитывает сколько времени пользователь провел в игре, если известно
 *
 * @param playingTimeInSeconds - количество секунд проведенных пользователем в игре
 * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Переменные, которые можно изменять для проверки различных вариантов входных параметров
        int playingTimeInSeconds = 100000;

        // Код необходимый для тестирования, не изменять
        playingTimeInSeconds = (args.length == 1) ? Integer.parseInt(args[0]) : playingTimeInSeconds;

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        int days = playingTimeInSeconds / (60 * 60 * 24);
        int hours = (playingTimeInSeconds - days * (60 * 60 * 24)) / 3600;
        int minutes = ((playingTimeInSeconds - (hours * 3600 + days * (60 * 60 * 24))) / 60);
        int seconds = playingTimeInSeconds - (days * (60 * 60 * 24) + hours * 3600 + minutes * 60);
        System.out.println(days + " " + hours + ":" + minutes + ":" + seconds);
    }
}