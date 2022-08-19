package com.rakovets.course.java.core.practice.date_and_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public final class DateWrapperUtil implements TemporalAdjuster {
    private static final String INFO = "Invalid input";

    /**
     * Changes the date to the nearest (in days) January 1st
     *
     * @param temporal the temporal object to adjust, not null.
     * @return modified date.
     */
    @Override
    public Temporal adjustInto(Temporal temporal) {
        int halfYear = 183;
        if (temporal.get(ChronoField.DAY_OF_YEAR) >= halfYear) {
            return temporal.with(TemporalAdjusters.firstDayOfNextYear());
        } else {
            return temporal.with(TemporalAdjusters.firstDayOfYear());
        }
    }

    /**
     * Accepts year, month, day and returns LocalDate
     *
     * @param year       received year.
     * @param month      received month.
     * @param dayOfMonth received day.
     * @return LocalDate with the given parameters.
     * @throws DateException throws an exception on invalid input.
     */
    public LocalDate getLocalDate(int year, int month, int dayOfMonth) throws DateException {
        if (year < 0 || month < 0 || dayOfMonth < 0) {
            throw new DateException("Invalid input. Values less than 0.");
        } else {
            return LocalDate.of(year, month, dayOfMonth);
        }
    }

    /**
     * Takes a LocalDate and changes it to the given value and change type.
     *
     * @param localDate       received LocalDate.
     * @param value           resulting value.
     * @param chronicUnitEnum enum type to add something.
     * @return LocalDate with the given parameters.
     * @throws DateException throws an exception on invalid input.
     */
    public LocalDate getLocaleDate(LocalDate localDate, int value, ChronoUnit chronicUnitEnum) throws DateException {
        if (localDate == null || value < 0 || chronicUnitEnum == null) {
            throw new DateException(INFO);
        } else {
            return localDate.plus(value, chronicUnitEnum);
        }
    }

    /**
     * Formats the date according to the received pattern.
     *
     * @param date      received LocalDate.
     * @param formatter received DateTimeFormatter.
     * @return string according to this pattern
     * @throws DateException throws an exception on invalid input.
     */
    public String getLocaleDate(LocalDate date, DateTimeFormatter formatter) throws DateException {
        if (date == null || formatter == null) {
            throw new DateException(INFO);
        } else {
            return date.format(formatter);
        }
    }

    /**
     * Parses a string into a LocalDate according to the given conditions.
     *
     * @param date      received string for parse to LocaleDate.
     * @param formatter received DateTimeFormatter.
     * @return LocalDate with the given parameters.
     * @throws DateException throws an exception on invalid input.
     */
    public LocalDate getLocaleDate(String date, DateTimeFormatter formatter) throws DateException {
        if (date == null || formatter == null) {
            throw new DateException(INFO);
        } else {
            return LocalDate.parse(date, formatter);
        }
    }

    /**
     * Counts the amount of something between two dates.
     *
     * @param localDateFirst  first date.
     * @param localDateSecond second date.
     * @param unit            type of count between dates.
     * @return difference between dates.
     * @throws DateException throws an exception on invalid input.
     */
    public long differenceBetween(LocalDate localDateFirst, LocalDate localDateSecond, ChronoUnit unit)
            throws DateException {
        if (localDateFirst == null || localDateSecond == null || unit == null) {
            throw new DateException(INFO);
        } else {
            return unit.between(localDateFirst, localDateSecond);
        }
    }

    /**
     * Adding something to the date.
     *
     * @param localDate received date.
     * @param value     to change the date.
     * @param unit      change type.
     * @return date after the change.
     * @throws DateException throws an exception on invalid input.
     */
    public LocalDate addToDate(LocalDate localDate, int value, ChronoUnit unit) throws DateException {
        if (localDate == null || unit == null) {
            throw new DateException(INFO);
        } else {
            return localDate.with(temporal -> temporal.plus(value, unit));
        }
    }
}
