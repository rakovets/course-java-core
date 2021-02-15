package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

class DateWrapperTest {

    @Test
    void getLocalDate() {
        LocalDate expected = LocalDate.of(2015, 12,15);

        LocalDate actual = DateWrapper.getLocalDate(2015, 12, 15);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDatePlusNumberOfMonth() {
        LocalDate local = LocalDate.of(2020, 3, 5);
        LocalDate expected = LocalDate.of(2020, 5, 5);

        LocalDate actual = DateWrapper.getDatePlusNumberOfMonth(local, 2);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getStringOfPattern() {
        LocalDate local = LocalDate.of(2020, 3, 5);
        String expected = "05 03 2020";

        String actual = DateWrapper.getStringOfPattern(local, "dd MM yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getLocalDateOfPattern() {
        LocalDate expected = LocalDate.of(2020, 3, 5);

        LocalDate actual = DateWrapper.getLocalDateOfPattern("05 03 2020", "dd MM yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDays() {
        int expected = 10;

        int actual = DateWrapper.getDays(LocalDate.of(2020, 3, 5), LocalDate.of(2020, 3, 15));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDate() throws ParseException {
       Date actual = DateWrapper.getDate(2020, 1, 1);

       Assertions.assertEquals("Wed Jan 01 00:00:00 MSK 2020", actual.toString());
    }
}
