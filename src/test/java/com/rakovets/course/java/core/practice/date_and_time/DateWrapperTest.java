package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DateWrapperTest {

    @Test
    void createLocalDate() {
        LocalDate localDate = DateWrapper.createLocalDate(2021,2,14);
        assertEquals("2021-02-14", localDate.toString());
    }

    @Test
    void changeMonth() {
      LocalDate localDate1 = DateWrapper.createLocalDate(2021, 2, 14);
      LocalDate localDate2 = DateWrapper.changeMonth(localDate1, 3);
      assertEquals("2021-05-14", localDate2.toString());
    }

    @Test
    void localDatePattern() {
        LocalDate localDate = DateWrapper.createLocalDate(2021, 2, 14);
        assertEquals("14 February 2021", DateWrapper.localDatePattern(localDate,"d MMMM yyyy"));
    }

    @Test
    void localDateFormat() {
        LocalDate localDate = DateWrapper.createLocalDate(2021, 2, 14);
        assertEquals("February 14 2021", DateWrapper.localDateFormat("2021-02-14", "MMMM d yyyy"));
    }

    @Test
    void dayBetween() {
        LocalDate localDate1 = DateWrapper.createLocalDate(2021, 2, 14);
        LocalDate localDate2 = DateWrapper.createLocalDate(2021, 2, 24);
        assertEquals(10, DateWrapper.dayBetween(localDate1, localDate2));

    }

}
