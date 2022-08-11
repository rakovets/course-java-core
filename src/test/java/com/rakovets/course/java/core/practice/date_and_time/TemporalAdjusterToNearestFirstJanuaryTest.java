package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TemporalAdjusterToNearestFirstJanuaryTest {
    private final TemporalAdjusterToNearestFirstJanuary temporalAdjuster = new TemporalAdjusterToNearestFirstJanuary();

    @Test
    public void testAdjustIntoPreviousFirstJanuary() {
        LocalDate localDate = LocalDate.of(2010, 3, 10);
        LocalDate expected = LocalDate.of(2010, 1, 1);

        LocalDate actual = (LocalDate) temporalAdjuster.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAdjustIntoNextFirstJanuary() {
        LocalDate localDate = LocalDate.of(2010, 8, 10);
        LocalDate expected = LocalDate.of(2011, 1, 1);

        LocalDate actual = (LocalDate) temporalAdjuster.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAdjustIntoMiddleOfTheYearNextFirstJanuary() {
        LocalDate localDate = LocalDate.of(2010, 7, 3);
        LocalDate expected = LocalDate.of(2011, 1, 1);

        LocalDate actual = (LocalDate) temporalAdjuster.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAdjustIntoMiddleOfTheYearPreviousFirstJanuary() {
        LocalDate localDate = LocalDate.of(2010, 7, 2);
        LocalDate expected = LocalDate.of(2010, 1, 1);

        LocalDate actual = (LocalDate) temporalAdjuster.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAdjustIntoLastDayOfTheYear() {
        LocalDate localDate = LocalDate.of(2010, 12, 31);
        LocalDate expected = LocalDate.of(2011, 1, 1);

        LocalDate actual = (LocalDate) temporalAdjuster.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAdjustIntoFirstDayOfTheYear() {
        LocalDate localDate = LocalDate.of(2010, 1, 1);
        LocalDate expected = LocalDate.of(2010, 1, 1);

        LocalDate actual = (LocalDate) temporalAdjuster.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }
}
