package com.rakovets.course.java.core.practice.operators;

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
        int days = 0, hours = 0, min = 0, sec = 0;

        days = playingTimeInSeconds / 86400;
        hours = playingTimeInSeconds % 86400;
        min = hours % 3600;
        hours /= 3600;
        sec = min % 60;
        min /= 60;

        /**boolean agreem = true;
        while (agreem) {
            if (playingTimeInSeconds >= 60) {
                playingTimeInSeconds -= 60;
                min++;
            } else {
                sec = playingTimeInSeconds;
                agreem = false;
            }
            if (min == 60) {
                hours++;
                min = 0;
            }
            if (hours == 24) {
                days++;
                hours = 0;
            }
        }**/

        String time = days + " " + hours + ":" + min + ":" + sec;
        return time;
    }
}
