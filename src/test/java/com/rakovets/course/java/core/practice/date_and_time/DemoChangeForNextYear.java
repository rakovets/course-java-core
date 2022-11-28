package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.specification_task02.ChangeForNextYear;

import java.time.LocalDate;

public class DemoChangeForNextYear {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.with(new ChangeForNextYear());
        System.out.println(localDate);
    }
}
