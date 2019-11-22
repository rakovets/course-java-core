package com.rakovets.course.challenge;

public class TimeTests {
    public static void main(String[] args) {
        Time Time = new Time(876, 45, 44);

        Time.getHours();
        Time.getMinutes();
        Time.getSeconds();
        Time.getTotalSeconds();
        Time.setMinutes(564);
        Time.setHours(43);
        Time.getHours();
        Time.getMinutes();
        Time.getTotalSeconds();
        Time.getSeconds();
        Time.setSeconds(34);
        Time.getSeconds();
        Time TotalSecondsTime = new Time(3156344);
        TotalSecondsTime.getHours();
        TotalSecondsTime.getMinutes();
        TotalSecondsTime.getSeconds();
        TotalSecondsTime.getTotalSeconds();
        TotalSecondsTime.setMinutes(564);
        TotalSecondsTime.setHours(43);
        TotalSecondsTime.getHours();
        TotalSecondsTime.getMinutes();
        TotalSecondsTime.getTotalSeconds();
        TotalSecondsTime.getSeconds();
        TotalSecondsTime.setSeconds(34);
        TotalSecondsTime.getSeconds();


    }
}
