package com.rakovets.course.java.core.practice.date_and_time;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else
                return true;
        } else
            return false;
    }
}
