package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateWrapperTest {
    private final DateWrapper dateWrapper = new DateWrapper();

    @Test
    void testGetLocalDate() {
        int expectedYear = 1989;
        int expectedMonth = 12;
        int expectedDay = 31;

        LocalDate actual = dateWrapper.getLocalDate(1989, 12, 31);
        int actualYear = actual.getYear();
        int actualMonth = actual.getMonthValue();
        int actualDay = actual.getDayOfMonth();

        Assertions.assertEquals(expectedYear, actualYear);
        Assertions.assertEquals(expectedMonth, actualMonth);
        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    void testGetLocalDateWithChangedMonth() {
        LocalDate localDate = LocalDate.of(1989, 12, 31);
        int expectedYear = 1992;
        int expectedMonth = 12;
        int expectedDay = 31;

        LocalDate actual = dateWrapper.getLocalDateWithChangedMonth(localDate, 36);
        int actualYear = actual.getYear();
        int actualMonth = actual.getMonthValue();
        int actualDay = actual.getDayOfMonth();

        Assertions.assertEquals(expectedMonth, actualMonth);
        Assertions.assertEquals(expectedDay, actualDay);
        Assertions.assertEquals(expectedYear, actualYear);
    }

    @Test
    void testGetStringDateFromPattern() {
        LocalDate localDate = LocalDate.of(1989, 9, 1);

        String expected = "1989-9-1";

        String actual = dateWrapper.getStringDateFromPattern(localDate, "yyyy-M-d");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetLocalDateFromPattern() {
        LocalDate expected = LocalDate.of(1989, 12, 31);

        LocalDate actual = dateWrapper.getLocalDateFromPattern("12:31:1989", "MM:dd:yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetDifferenceInDaysBetweenLocalDates() {
        LocalDate localDateFirst = LocalDate.of(2022, 1, 1);
        LocalDate localDateSecond = LocalDate.of(2022, 12, 31);

        long expected = 364;

        long actual = dateWrapper.getDifferenceInDaysBetweenLocalDates(localDateFirst, localDateSecond);

        Assertions.assertEquals(expected, actual);
    }
}
