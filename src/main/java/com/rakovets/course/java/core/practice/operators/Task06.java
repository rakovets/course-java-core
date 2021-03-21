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
      /*
        int sec = playingTimeInSeconds%60;
        int m = playingTimeInSeconds/60;
        int day = m/60/24;
        int hour = (m-day*60*24)/60;
        int min = m-day*24*60-hour*60;
      */
        int sec=playingTimeInSeconds%60;
        int min=playingTimeInSeconds/60%60;
        int hour=playingTimeInSeconds/3600%24;
        int day =playingTimeInSeconds/(3600*24);
        String answer;
        answer= day+" "+hour+":"+min+":"+sec;
        return answer;
    }
}
