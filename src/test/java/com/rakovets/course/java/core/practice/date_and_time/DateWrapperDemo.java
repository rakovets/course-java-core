package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;

public class DateWrapperDemo {
    public static void main(String[] args) {
        LocalDate dateOne = LocalDate.of(2001, 3,3);
        LocalDate dateTwo = LocalDate.now();
        System.out.println(DateWrapper.gapeBetweenDatas(dateTwo,dateOne));
    }
}
