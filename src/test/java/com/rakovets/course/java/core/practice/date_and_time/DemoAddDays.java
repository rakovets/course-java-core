package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.specification_task02.AddDays;

import java.time.LocalDate;

public class DemoAddDays {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.with(new AddDays());
        System.out.println(localDate);
    }
}
