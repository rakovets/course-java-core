package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.util.Locale;

public class DateWrapper implements TemporalAdjuster {
        public static LocalDate getLocalDate(int year, int month, int day) {
            return LocalDate.of(year, month, day);
        }

        public static LocalDate dateAfterNMonth(LocalDate date, int amountMonth) {
            return date.plusMonths(amountMonth);
        }

        public static String dateFormat(LocalDate date, String pattern) {
            return date.format(DateTimeFormatter.ofPattern(pattern, Locale.UK));
        }

        public static LocalDate dateFormat(String time, String pattern) {
            return LocalDate.parse(time, DateTimeFormatter.ofPattern(pattern, Locale.UK));
        }

        public static long amountDaysBetweenDates(LocalDate firstDate, LocalDate secondDate) {
            return ChronoUnit.DAYS.between(firstDate, secondDate);
        }

        @Override
        public Temporal adjustInto(Temporal temporal) {
            final int CENTER_OF_LEAP_YEAR= 366 / 2;
            final int CENTER_OF_DEFAULT_YEAR = 365 / 2;
            boolean leapYear = temporal.get(ChronoField.YEAR) % 4 == 0
                    && temporal.get(ChronoField.YEAR) % 100 == 0 && temporal.get(ChronoField.YEAR) % 400 == 0;
            int periodDays = (int)ChronoUnit.DAYS.between(temporal,
                    LocalDate.of(temporal.get(ChronoField.YEAR) + 1, 1, 1));

            if (leapYear && periodDays < CENTER_OF_LEAP_YEAR || !leapYear && periodDays < CENTER_OF_DEFAULT_YEAR) {
                return temporal
                        .with(ChronoField.YEAR, temporal.get(ChronoField.YEAR) + 1)
                        .with(ChronoField.MONTH_OF_YEAR, 1)
                        .with(ChronoField.DAY_OF_MONTH, 1);
            } else if (periodDays == CENTER_OF_DEFAULT_YEAR || periodDays == CENTER_OF_LEAP_YEAR) {
                return temporal;
            } else {
                return temporal
                        .with(ChronoField.MONTH_OF_YEAR, 1)
                        .with(ChronoField.DAY_OF_MONTH, 1);
            }
        }

        public static Temporal adjustInto(Temporal temporal, int n) {
            int addDays = 5;
            return temporal.plus(n, ChronoUnit.DAYS);
        }
    }
