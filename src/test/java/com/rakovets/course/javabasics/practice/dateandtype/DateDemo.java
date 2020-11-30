package com.rakovets.course.javabasics.practice.dateandtype;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class DateDemo {
    public static void main(String[] args) {

        LocalDate currentDate = DateWrapper.getLocaleDate(1981,12,05);

        System.out.println("Current Date" + currentDate + "\n");
        int n = 3;
        System.out.println("Current Date + " + n + DateWrapper.getLocaleDatePlusN(currentDate, n));

    }
}
