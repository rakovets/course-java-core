package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.specification_task02.First;

import java.time.LocalDate;

public class DemoFirst {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.with(new First());
        System.out.println(localDate);
    }
}
