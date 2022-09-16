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
        //TODO
        // Код, решающий задачу пишем ниже, при этом используя параметры метода
        final int TO_MINUTES = 60;
        final int TO_HOURS = 60;
        final int TO_DAYS = 24;
        int day = playingTimeInSeconds / (TO_MINUTES * TO_HOURS * TO_DAYS);
        int secWithoutDay =  playingTimeInSeconds % (TO_MINUTES * TO_HOURS * TO_DAYS);
        int hour = secWithoutDay/ (TO_MINUTES * TO_HOURS);
        int secWithOutDaysAhdHour = secWithoutDay % (TO_MINUTES * TO_HOURS) ;
        int min = secWithOutDaysAhdHour / TO_MINUTES;
        int sec = secWithOutDaysAhdHour % TO_MINUTES;
        return day + " " + hour + ":" + min + ":" + sec;
    }
}
