package com.rakovets.course.javabasics.practice.dateandtype;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateWrapperTest {

    @Test
    void task1() {
        LocalDate date1 = DateWrapper.getTime(1997,8,1);
        Assertions.assertEquals("1997-08-01", date1.toString());
        LocalDate date2 = DateWrapper.getPlusnMonth(date1, -3);
        Assertions.assertEquals("1997-05-01", date2.toString());
        Assertions.assertEquals("May 1, 1997", DateWrapper.getLocalDateOfFormat(date2, "MMMM d, yyyy"));
        Assertions.assertEquals("November 28, 2020", DateWrapper.getLocalDateOfFormat("2020-11-28", "MMMM d, yyyy"));
        Assertions.assertEquals(92, DateWrapper.getDays(date2, date1));
    }

    @Test
    void task2() {
        LocalDate date = LocalDate.of(1997,8,1);
        int ndays = 10;
        Assertions.assertEquals("1997-08-11", date.with(DateWrapper.plusDays(ndays)).toString());
        Assertions.assertEquals("2021-01-01", LocalDate.of(2020, 9, 7).with(DateWrapper.changeDay()).toString());
    }

}
