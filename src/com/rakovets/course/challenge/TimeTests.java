package com.rakovets.course.challenge;

public class TimeTests {
    public static void main(String[] args) {
        Time Time = new Time(876, 6576, 76);
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


    }
}
