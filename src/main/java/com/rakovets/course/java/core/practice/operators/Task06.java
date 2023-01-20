package com.rakovets.course.java.core.practice.operators;

import java.util.concurrent.TimeUnit;

/**
 * Разработать программу для игрового движка.
 *
 * @author Dmitry Rakovets
 */
class Task06 {
    /**
     * The entry point of the task
     *
     * @param args entry arguments
     */
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int playingTimeInSeconds = 4567;

        String playingTime = getPlayingTime(playingTimeInSeconds);
        System.out.printf("Result: %s", playingTime);
    }

    /**
     * Высчитывает сколько времени пользователь провел в игре.
     *
     * @param playingTimeInSeconds - количество секунд проведенных пользователем в игре
     * @return время в формате 'D H:m:s', где D - дни, H - часы, m - минуты, s - секунды
     */
    static String getPlayingTime(int playingTimeInSeconds) {
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        long days = convertSecondsToFullDays(playingTimeInSeconds);
        long hours = convertSecondsToHours(playingTimeInSeconds) - convertDaysToHours(days);
        long minutes = convertSecondsToMinutes(playingTimeInSeconds) - convertHoursToMinutes(hours) - convertDaysToMinutes(days);
        long seconds = playingTimeInSeconds - convertDaysToSeconds(days) - convertHoursToSeconds(hours) - convertMinutesToSeconds(minutes);
        return String.format("%s %s:%s:%s", days, hours, minutes, seconds);
    }

    private static long convertSecondsToFullDays(int seconds) {
        return TimeUnit.SECONDS.toDays(seconds);
    }

    private static long convertDaysToHours(long days) {
        return TimeUnit.DAYS.toHours(days);
    }

    private static long convertSecondsToHours(long seconds) {
        return TimeUnit.SECONDS.toHours(seconds);
    }

    private static long convertSecondsToMinutes(long seconds) {
        return TimeUnit.SECONDS.toMinutes(seconds);
    }

    private static long convertHoursToMinutes(long hours) {
        return TimeUnit.HOURS.toMinutes(hours);
    }

    private static long convertDaysToMinutes(long days) {
        return TimeUnit.DAYS.toMinutes(days);
    }

    private static long convertDaysToSeconds(long days) {
        return TimeUnit.DAYS.toSeconds(days);
    }

    private static long convertHoursToSeconds(long days) {
        return TimeUnit.HOURS.toSeconds(days);
    }

    private static long convertMinutesToSeconds(long days) {
        return TimeUnit.MINUTES.toSeconds(days);
    }
}
