package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class DateWrapperDemo {
    public static void main(String[] args) {
        String text = "MM-dd-yy";
        System.out.println(DateWrapper.getLocalDate(2021, 4, 27));
        System.out.println(DateWrapper.dateAfterNMonth(LocalDate.now(), 9));
        System.out.println(DateWrapper.dateFormat(LocalDate.now(), text));

    }
}
