package com.rakovets.course.java.core.practice.operators;

import com.rakovets.course.java.core.util.constants.LimitValue;
import com.rakovets.course.java.core.util.RandomUtil;

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
        int playingTimeInSeconds = RandomUtil.getRandomIntegerNumber(LimitValue.THOUSANDS.getLimitValue());

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
        long days = TimeUnit.SECONDS.toDays(playingTimeInSeconds);
        long hours = TimeUnit.SECONDS.toHours(playingTimeInSeconds) - TimeUnit.DAYS.toHours(days);
        long minutes = TimeUnit.SECONDS.toMinutes(playingTimeInSeconds) - TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(playingTimeInSeconds));
        long seconds = TimeUnit.SECONDS.toSeconds(playingTimeInSeconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(playingTimeInSeconds));
        return String.format("%s %s:%s:%s", days, hours, minutes, seconds);
    }
}
