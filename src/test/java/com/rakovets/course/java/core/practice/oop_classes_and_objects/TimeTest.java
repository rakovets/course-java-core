package com.rakovets.course.java.core.practice.oop_classes_and_objects;

import java.util.Scanner;

public class TimeTest {
    /**
     * @author Anastasia Melnikova
     * @since 18.06.2022
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter number of hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter number of minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter number of seconds: ");
        int seconds = scanner.nextInt();

        Time time = new Time(hours, minutes, seconds);
        System.out.printf("\nTotal time in seconds: %d", time.getTotalSeconds());
        System.out.printf("\nHours:%d Minutes:%d Seconds:%d", time.getHours(), time.getMinutes(), time.getSeconds());

        System.out.print("\n\nEnter number of hours: ");
        hours = scanner.nextInt();
        System.out.print("Enter number of minutes: ");
        minutes = scanner.nextInt();
        System.out.print("Enter number of seconds: ");
        seconds = scanner.nextInt();

        time.setHours(hours);
        time.setMinutes(minutes);
        time.setSeconds(seconds);

        System.out.printf("\nTotal time in seconds: %d", time.getTotalSeconds());
        System.out.printf("\nHours:%d Minutes:%d Seconds:%d\n", time.getHours(), time.getMinutes(), time.getSeconds());

        System.out.print("\nEnter total time in seconds: ");
        long totalTimeInSeconds = scanner.nextLong();
        Time totalTime = new Time(totalTimeInSeconds);
        System.out.printf("\nTotal time in seconds: %d", totalTime.getTotalSeconds());
        System.out.printf("\nHours:%d Minutes:%d Seconds:%d\n", totalTime.getHours(), totalTime.getMinutes(), totalTime.getSeconds());
    }
}
