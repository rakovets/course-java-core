package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TemporalAdjusterToNearestFirstJanuaryTest {
    private final TemporalAdjusterToNearestFirstJanuary temporalAdjuster = new TemporalAdjusterToNearestFirstJanuary();

    @Test
    public void testAdjustIntoPreviousFirstJanuary() {
        LocalDate localDate = LocalDate.of(2010, 3, 10);
        String expected = "2010-01-01";

        String actual = temporalAdjuster.adjustInto(localDate).toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAdjustIntoNextFirstJanuary() {
        LocalDate localDate = LocalDate.of(2010, 8, 10);
        String expected = "2011-01-01";

        String actual = temporalAdjuster.adjustInto(localDate).toString();

        Assertions.assertEquals(expected, actual);
    }
}
