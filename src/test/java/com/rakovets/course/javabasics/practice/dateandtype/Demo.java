package com.rakovets.course.javabasics.practice.dateandtype;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Demo {
    public static void main(String[] args) {
        System.out.println(new Date(1606918520000L));
        Calendar calendar = new GregorianCalendar(2020, Calendar.DECEMBER, 1) {
            @Override
            public String toString() {
                return YEAR + "-" + MONTH + "-" + DAY_OF_MONTH;
            }
        };
        System.out.println(calendar);
    }
}
