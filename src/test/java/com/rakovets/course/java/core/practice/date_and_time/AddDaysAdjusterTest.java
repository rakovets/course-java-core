package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AddDaysAdjusterTest {
    private AddDaysAdjuster addDaysAdjuster = new AddDaysAdjuster(29);

    @Test
    public void testAddDayToLocalDate() {
        LocalDate localDate = LocalDate.of(2022, 1, 1);
        String expected = "2022-01-30";

        LocalDate actual = localDate.with(addDaysAdjuster);

        Assertions.assertEquals(expected, actual);
    }
}
