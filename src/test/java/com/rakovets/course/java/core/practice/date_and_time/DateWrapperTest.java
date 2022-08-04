package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class DateWrapperTest {
    private final DateWrapper dataWrapper = new DateWrapper();

    @Test
    void testGetLocalDate() {
        LocalDate actual = dataWrapper.getLocalDate(2022, 8, 3);
        int expectedYear = 2022;
        int expectedMonth = 8;
        int expectedDay = 3;

        int actualYear = actual.getYear();
        int actualMonth = actual.getMonthValue();
        int actualDay = actual.getDayOfMonth();

        Assertions.assertEquals(expectedMonth,actualMonth);
        Assertions.assertEquals(expectedDay,actualDay);
        Assertions.assertEquals(expectedYear,actualYear);
    }

    @Test
    void testGetLocalDateAfterNMonths() {
        LocalDate localDate = LocalDate.of(2022, 8, 3);
        int expectedYear = 2024;
        int expectedMonth = 8;
        int expectedDay = 3;

        LocalDate actual = dataWrapper.getLocalDateAfterNMonths(localDate, 24);
        int actualYear = actual.getYear();
        int actualMonth = actual.getMonthValue();
        int actualDay = actual.getDayOfMonth();

        Assertions.assertEquals(expectedMonth,actualMonth);
        Assertions.assertEquals(expectedDay,actualDay);
        Assertions.assertEquals(expectedYear,actualYear);
    }

    @Test
    void testGetDateByPattern() {
        LocalDate localDate = LocalDate.of(2022, 8, 30);
        String expected = "08 30, 2022";

        String actual = dataWrapper.getDateByPattern(localDate, "MM d, yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetLocalDateByPattern() {
        LocalDate expected = LocalDate.of(2022, 12, 3);

        LocalDate actual = dataWrapper.getLocalDateByPattern("12 3, 2022", "MM d, yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testGetAmountOfDaysBetweenLocalDates() {
        LocalDate localDateFirst = LocalDate.of(2022, 2, 28);
        LocalDate localDateSecond = LocalDate.of(2022, 3, 2);

        int expected = 2;

        int actual = dataWrapper.getAmountOfDaysBetweenLocalDates(localDateFirst, localDateSecond);

        Assertions.assertEquals(expected, actual);
    }
}
