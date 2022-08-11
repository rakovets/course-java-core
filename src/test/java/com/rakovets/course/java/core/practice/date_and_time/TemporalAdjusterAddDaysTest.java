package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TemporalAdjusterAddDaysTest {
    private final TemporalAdjusterAddDays temporalAdjuster = new TemporalAdjusterAddDays(10);

    @Test
    public void testAdjustInto() {
        LocalDate localDate = LocalDate.of(2010, 3, 10);
        LocalDate expected = LocalDate.of(2010, 3, 20);

        LocalDate actual = (LocalDate) temporalAdjuster.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }
}
