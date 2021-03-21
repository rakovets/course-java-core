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
        int daysNumber = playingTimeInSeconds / 86400;
        int hoursNumber = playingTimeInSeconds / 3600 - daysNumber * 24;
        int minutesNumber = playingTimeInSeconds / 60 - (daysNumber * 1440 + hoursNumber * 60);
        int secondsNumber = playingTimeInSeconds - (daysNumber * 86400 + hoursNumber * 3600 + minutesNumber * 60);
        String timeInPlaying = (daysNumber + " " + hoursNumber + ":" + minutesNumber + ":" + secondsNumber);
        return timeInPlaying;
    }
}
