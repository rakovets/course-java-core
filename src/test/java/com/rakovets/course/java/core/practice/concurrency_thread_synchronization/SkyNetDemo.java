package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import java.util.Random;

public class SkyNetDemo {
    public static void main(String[] args) {
        int days = new Random().nextInt();
        System.out.println("Count days for farming : " + days);
        DayPeriod dayPeriod = new DayPeriod(days);


    }
}
