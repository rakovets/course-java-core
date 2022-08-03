package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class DataWrapperTest {
    private final DataWrapper dataWrapper = new DataWrapper();

    @Test
    void testGetLocalDate() {
        LocalDate actual = dataWrapper.getLocalDate(2022, 8, 3);
        int expectedYear = 2022;
        int expectedMonth = 8;
        int expectedDay = 3;

        int actualYear = actual.getYear();
        int actualMonth = actual.getMonthValue();
        int actualDay = actual.getDayOfMonth();

        Assertions.assertEquals(actualMonth, expectedMonth);
        Assertions.assertEquals(actualDay, expectedDay);
        Assertions.assertEquals(actualYear, expectedYear);
    }

    @Test
    void testGetLocalDateInXMonths() {
        LocalDate localDate = LocalDate.of(2022, 8, 3);
        int expectedYear = 2024;
        int expectedMonth = 8;
        int expectedDay = 3;

        LocalDate actual = dataWrapper.getLocalDateInXMonths(localDate, 24);
        int actualYear = actual.getYear();
        int actualMonth = actual.getMonthValue();
        int actualDay = actual.getDayOfMonth();

        Assertions.assertEquals(actualMonth, expectedMonth);
        Assertions.assertEquals(actualDay, expectedDay);
        Assertions.assertEquals(actualYear, expectedYear);
    }

    @Test
    void testGetLocalDatePattern() {
        LocalDate localDate = LocalDate.of(2022, 8, 30);
        String expected = "08 30, 2022";

        String actual = dataWrapper.getLocalDatePattern(localDate, "MM d, yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetLocalDatePatternFromLocalDate() {
        LocalDate localDate = LocalDate.of(2022, 8, 30);
        String expected = "08 30, 2022";

        String actual = dataWrapper.getLocalDatePattern(localDate, "MM d, yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetLocalDatePatternFromString() {
        LocalDate expected = LocalDate.of(2022, 12, 3);

        LocalDate actual = dataWrapper.getLocalDatePattern("12 3, 2022", "MM d, yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetAmountOfMonthBetweenTwoDates() {
        LocalDate localDateFirst = LocalDate.of(2022, 1, 3);
        LocalDate localDateSecond = LocalDate.of(2022, 3, 1);

        int expected = 1;

        int actual = dataWrapper.getAmountOfMonthBetweenTwoDates(localDateFirst, localDateSecond);

        Assertions.assertEquals(expected, actual);
    }
}
