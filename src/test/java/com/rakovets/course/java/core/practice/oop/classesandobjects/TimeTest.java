package com.rakovets.course.java.core.practice.oop.classesandobjects;

import com.rakovets.course.java.core.example.oop.classesandobjects.Time;

public class TimeTest {
    public static void main(String[] args) {
        Time hoursMinutesSeconds = new Time(5111);

        hoursMinutesSeconds.setHours(15);
        hoursMinutesSeconds.setMinutes(30);
        hoursMinutesSeconds.setSeconds(59);

        System.out.println(hoursMinutesSeconds.getHours() + " " + hoursMinutesSeconds.getMinutes() + " " + hoursMinutesSeconds.getSeconds());
        System.out.println(hoursMinutesSeconds.getTotalSeconds());
    }
}
