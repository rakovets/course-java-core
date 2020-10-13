package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        Scanner scanner = new Scanner(System.in);
        System.out.print(ANSI_RED + "Input time intervals (HH:mm:ss) : " + ANSI_RESET);
        int inputHours = scanner.nextInt();
        int inputMinutes = scanner.nextInt();
        int inputSeconds = scanner.nextInt();
        Time timetolern = new Time(inputHours, inputMinutes, inputSeconds);

        System.out.println(ANSI_YELLOW + "Time is: "+ ANSI_RESET + timetolern.getHours() + ":" + timetolern.getMinutes() + ":" + timetolern.getSeconds());
        timetolern.setHours(15);
        timetolern.setMinutes(30);
        timetolern.setSeconds(50);
        System.out.println(ANSI_GREEN + "Updates is: " + ANSI_RESET + timetolern.getHours() + ":" + timetolern.getMinutes() + ":" + timetolern.getSeconds());
        System.out.println(ANSI_RED + "Total seconds is: " + ANSI_RESET + timetolern.getTotalSeconds());
    }
}