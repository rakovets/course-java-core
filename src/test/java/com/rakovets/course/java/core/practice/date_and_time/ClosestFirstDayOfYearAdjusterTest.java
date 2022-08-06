package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ClosestFirstDayOfYearAdjusterTest {
    private ClosestFirstDayOfYearAdjuster closestFirstDayOfYearAdjuster = new ClosestFirstDayOfYearAdjuster();

    @Test
    public void testClosestFirstDayOfYearCurrentYear() {
        LocalDate localDate = LocalDate.of(2022, 2, 22);
        String expected = "2022-01-01";

        String actual = localDate.with(closestFirstDayOfYearAdjuster).toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testClosestFirstDayOfYearNextYear() {
        LocalDate localDate = LocalDate.of(2022, 10, 22);
        String expected = "2023-01-01";

        String actual = localDate.with(closestFirstDayOfYearAdjuster).toString();

        Assertions.assertEquals(expected, actual);
    }
}
