package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.temporal_adjuster_implementations.AddDaysToDate;
import com.rakovets.course.java.core.practice.date_and_time.temporal_adjuster_implementations.ChangeDateToNearestJanuary;

import java.time.LocalDate;

public class DateWrapperDemo {
    public static void main(String[] args) {
        AddDaysToDate addDay = new AddDaysToDate(10);
        ChangeDateToNearestJanuary changeDate = new ChangeDateToNearestJanuary();
        String time = "04-28-21";
        String pattern = "MM-dd-yy";
        System.out.println(DateWrapper.getLocalDate(2021, 4, 27));
        System.out.println(DateWrapper.getDateAfterNMonth(LocalDate.now(), 9));
        System.out.println(DateWrapper.getDateFormat(LocalDate.now(), pattern));
        System.out.println(DateWrapper.getDateFormat(time, pattern));
        System.out.println(DateWrapper.getAmountDaysBetweenDates(LocalDate.of(2001, 1, 1),
                LocalDate.of(2002, 1, 1)));
        System.out.println(addDay.adjustInto(LocalDate.now()));
        System.out.println(changeDate.adjustInto(LocalDate.of(2000, 7, 2)));
    }
}
