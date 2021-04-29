package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class DateWrapperTest {
    public static void main(String[] args) {
        System.out.println(DateWrapper.localDate(2014,12,23));
        System.out.println(DateWrapper.addToLocalDate(DateWrapper.localDate(2014,12,20),25));
    }
}
