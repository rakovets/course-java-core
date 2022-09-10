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
     * в минуте -60 сек
     * в часе -3600 сек
     * в дне - 86400 сек
     */
    static String getPlayingTime(int playingTimeInSeconds){
        int day = playingTimeInSeconds / 86400;
        int hour = (playingTimeInSeconds - day * 86400) / 3600;
        int minute = (playingTimeInSeconds - day * 86400 - hour * 3600) / 60;
        int sec = (playingTimeInSeconds-day * 86400 - hour * 3600) % 60;

        return (day + " " + hour + ":"+ minute+ ":"+sec);
    }
}
