package com.rakovets.course.javabasics.practice.oop.classesandobjects;

import com.rakovets.course.javabasics.practice.oop.classesandobjects.constants.ColorConsants;

import java.util.Scanner;

public class TimeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(ColorConsants.ANSI_RED + "Input time intervals (HH:mm:ss) : " + ColorConsants.ANSI_RESET);
        int inputHours = scanner.nextInt();
        int inputMinutes = scanner.nextInt();
        int inputSeconds = scanner.nextInt();
        Time timetolern = new Time(inputHours, inputMinutes, inputSeconds);

        System.out.println(ColorConsants.ANSI_YELLOW + "Time is: "+ ColorConsants.ANSI_RESET + timetolern.getHours() + ":" + timetolern.getMinutes() + ":" + timetolern.getSeconds());
        timetolern.setHours(15);
        timetolern.setMinutes(30);
        timetolern.setSeconds(50);
        System.out.println(ColorConsants.ANSI_GREEN + "Updates is: " + ColorConsants.ANSI_RESET + timetolern.getHours() + ":" + timetolern.getMinutes() + ":" + timetolern.getSeconds());
        System.out.println(ColorConsants.ANSI_RED + "Total seconds is: " + ColorConsants.ANSI_RESET + timetolern.getTotalSeconds());
    }
}