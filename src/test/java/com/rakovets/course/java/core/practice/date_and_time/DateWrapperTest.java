package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

class DateWrapperTest {

    @Test
    void getDate() {
        LocalDate getDate = DateWrapper.getDate(1991, 3, 13);
        Assertions.assertEquals("1991-03-13", getDate.toString());
    }

    @Test
    void getMonth() {
        LocalDate getDate = DateWrapper.getDate(1991, 4, 13);
        LocalDate getDate2 = DateWrapper.getMonth(getDate, 5);
        Assertions.assertEquals("1991-09-13", getDate2.toString());
    }

    @Test
    void getPattern() {
        LocalDate getDate = DateWrapper.getDate(1991, 3, 15);
        String datePattern = "M d, y";
        Assertions.assertEquals("3 15, 1991", DateWrapper.getPattern(getDate, datePattern));
    }

    @Test
    void getDayBetween() {
        LocalDate localDate = DateWrapper.getDate(1990, 1, 15);
        LocalDate localDate1 = DateWrapper.getDate(1991, 5, 15);
        Period expected = Period.of(1,4,0);
        Assertions.assertEquals(expected, DateWrapper.getDayBetween(localDate, localDate1));
    }

    @Test
    void addDays() {
        LocalDate localDate1 = DateWrapper.getDate(2012, 2, 12);
        Assertions.assertEquals("2012-02-22", localDate1.with(DateWrapper.addDays(10)).toString());
    }

    @Test
    void firstJanuary() {
        Assertions.assertEquals("2012-01-01", DateWrapper.getDate(2012, 2, 12).
                with(DateWrapper.firstJanuary(DateWrapper.getDate(2012, 2, 12))).toString());
        Assertions.assertEquals("2013-01-01", DateWrapper.getDate(2012, 7, 12).
                with(DateWrapper.firstJanuary(DateWrapper.getDate(2012, 7, 12))).toString());
    }

}
