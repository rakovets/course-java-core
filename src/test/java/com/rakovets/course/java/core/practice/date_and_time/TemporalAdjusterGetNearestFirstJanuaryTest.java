package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class TemporalAdjusterGetNearestFirstJanuaryTest {
    private final TemporalAdjusterGetNearestFirstJanuary temporalAdjuster = new TemporalAdjusterGetNearestFirstJanuary();

    @Test
    public void test() {
        LocalDate localDate = LocalDate.of(2010, 3, 10);
        String expected = "2010-01-01";

        String actual = temporalAdjuster.adjustInto(localDate).toString();

        Assertions.assertEquals(expected, actual);
    }
}
