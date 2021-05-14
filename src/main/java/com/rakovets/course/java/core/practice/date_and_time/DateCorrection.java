package com.rakovets.course.java.core.practice.date_and_time;

import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class DateCorrection implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal date) {
        int year = date.get(ChronoField.YEAR);
        int day = date.get(ChronoField.DAY_OF_YEAR);

        final int MIDDLE_OF_NON_LEAP_YEAR = 366/2;
        final int MIDDLE_OF_LEAP_YEAR = 265/2;
        int middleOfLeapYear;

        boolean leapYear;
        if (year % 4 != 0) {
            leapYear = false;
        } else if (year % 100 != 0) {
            leapYear = false;
        } else if (year % 400 != 0) {
            leapYear = false;
        } else {
            leapYear = true;
        }

        if (leapYear) {
            middleOfLeapYear = MIDDLE_OF_LEAP_YEAR;
        } else {
            middleOfLeapYear = MIDDLE_OF_NON_LEAP_YEAR;
        }

        if (day <= middleOfLeapYear) {
            return date.with(ChronoField.MONTH_OF_YEAR, 1).with(ChronoField.DAY_OF_MONTH, 1);
        } else {
            return date.with(ChronoField.YEAR, (year + 1)).with(ChronoField.MONTH_OF_YEAR, 1).with(ChronoField.DAY_OF_MONTH, 1);
        }
    }
}
