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
        int day = playingTimeInSeconds / (60 * 60 * 24);
        int secWithoutDay =  playingTimeInSeconds % (60 * 60 * 24);
        int hour = secWithoutDay/ (60 * 60);
        int secWithOutDaysAhdHour = secWithoutDay % (60 * 60) ;
        int min = secWithOutDaysAhdHour /60;
        int sec = secWithOutDaysAhdHour % 60;


        return day+" "+hour+":"+min+":"+sec;
    }
}
