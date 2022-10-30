package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.specification_task02.Second;

import java.time.LocalDate;

public class DemoSecond {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.with(new Second());
        System.out.println(localDate);
    }
}
