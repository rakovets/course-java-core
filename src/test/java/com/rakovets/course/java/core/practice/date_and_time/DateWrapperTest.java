package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;

public class DateWrapperTest {
    static Stream<Arguments> LocalDateArguments() {
        return Stream.of(
                Arguments.of(2022, 11, 3, LocalDate.of(2022, 11, 3)),
                Arguments.of(2034, 12, 3, LocalDate.of(2034, 12, 3)),
                Arguments.of(1999, 1, 1, LocalDate.of(1999, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("LocalDateArguments")
    public void getLocalDate(int year, int month, int day, LocalDate expected) {
        DateWrapper wrapper = new DateWrapper();

        LocalDate actual = wrapper.getLocalDate(year, month, day);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> LocalDateBeforeNMonthArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 11, 3), 5, LocalDate.of(2023, 4, 3)),
                Arguments.of(LocalDate.of(2034, 12, 3), 1, LocalDate.of(2035, 1, 3)),
                Arguments.of(LocalDate.of(1999, 1, 1), 12, LocalDate.of(2000, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("LocalDateBeforeNMonthArguments")
    public void getLocalDateBeforeNMonth(LocalDate date, int plusNMonth, LocalDate expected) {
        DateWrapper wrapper = new DateWrapper();

        LocalDate actual = wrapper.getLocalDateBeforeNMonth(date, plusNMonth);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> LocalDateFormatterStringArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 11, 3), DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.US), "November 03 2022"),
                Arguments.of(LocalDate.of(2020, 9, 11), DateTimeFormatter.ofPattern("dd, MM, yyyy"), "11, 09, 2020"),
                Arguments.of(LocalDate.of(2015, 1, 1), DateTimeFormatter.ofPattern("MMMM, d yy", Locale.UK), "January, 1 15")
        );
    }

    @ParameterizedTest
    @MethodSource("LocalDateFormatterStringArguments")
    public void getLocalDateFormatterString(LocalDate date, DateTimeFormatter formatter, String expected) {
        DateWrapper wrapper = new DateWrapper();

        String actual = wrapper.getLocalDateFormatterString(date, formatter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> StringFormatterLocalDateArguments() {
        return Stream.of(
                Arguments.of("11.3.2022", "MM.d.yyyy", LocalDate.of(2022, 11, 3)),
                Arguments.of("11, 09, 2020", "dd, MM, yyyy", LocalDate.of(2020, 9, 11)),
                Arguments.of("01, 1 15", "MM, d yy", LocalDate.of(2015, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("StringFormatterLocalDateArguments")
    public void getStringFormatterLocalDate(String date, String formatter, LocalDate expected) {
        DateWrapper wrapper = new DateWrapper();

        LocalDate actual = wrapper.getStringFormatterLocalDate(date, formatter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> CountDaysBetweenLocalDatesArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 11, 3), LocalDate.of(2020, 11, 3), -730),
                Arguments.of(LocalDate.of(2020, 9, 11), LocalDate.of(2020, 11, 11), 61),
                Arguments.of(LocalDate.of(2015, 1, 1), LocalDate.of(2016, 1, 3), 367)
        );
    }

    @ParameterizedTest
    @MethodSource("CountDaysBetweenLocalDatesArguments")
    public void getCountDaysBetweenLocalDates(LocalDate date, LocalDate date1, long expected) {
        DateWrapper wrapper = new DateWrapper();

        long actual = wrapper.getCountDaysBetweenLocalDates(date, date1);

        Assertions.assertEquals(expected, actual);
    }
}
