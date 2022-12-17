package com.rakovets.course.java.core.practice.operators;

import java.text.SimpleDateFormat;
import java.util.Date;

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
        //SimpleDateFormat playingTime = new SimpleDateFormat("d:h:m:s");
        //String result = playingTime.format(new Date(playingTimeInSeconds*1000));
        int day = playingTimeInSeconds / 86400;
        playingTimeInSeconds = playingTimeInSeconds - day*86400;
        int hour = playingTimeInSeconds / 3600;
        playingTimeInSeconds = playingTimeInSeconds - hour*3600;
        int minutes = playingTimeInSeconds / 60;
        playingTimeInSeconds = playingTimeInSeconds - minutes*60;


        return day + " " + hour + ":" + minutes + ":" + playingTimeInSeconds;
    }
}
