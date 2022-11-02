package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;

public class DateWrapperTest {
    DateWrapper dateWrapper = new DateWrapper();

    static Stream<Arguments> provideArgsForLocalDate() {
        return Stream.of(
                Arguments.of(2022, Month.DECEMBER, 1, LocalDate.of(2022,Month.DECEMBER, 1)),
                Arguments.of(2023, Month.JANUARY, 4,LocalDate.of(2023,Month.JANUARY, 4)),
                Arguments.of(2004,Month.MAY, 7,LocalDate.of(2004,Month.MAY, 7))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForLocalDate")
    public void getLocalDate(int year, Month month, int day, LocalDate expected) {
        LocalDate actual = dateWrapper.yearMonthDay(year, month, day);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsForAddMonth() {
        return Stream.of(
                Arguments.of(LocalDate.of(2021, Month.FEBRUARY,23), 3 , LocalDate.of(2021, Month.MAY,23)),
                Arguments.of(LocalDate.of(2017, Month.APRIL,15), 4, LocalDate.of(2017, Month.AUGUST,15)),
                Arguments.of(LocalDate.of(2015, Month.JANUARY,25), 8, LocalDate.of(2015, Month.SEPTEMBER, 25))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForAddMonth")
    public void getAddMonth(LocalDate yearMonthDay, int monthsAmount, LocalDate expected) {
        LocalDate actual = dateWrapper.addMonth(yearMonthDay,monthsAmount);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsForFormatLocalDateWithString() {
        return Stream.of(
                Arguments.of(LocalDate.of(2021,Month.FEBRUARY,23), DateTimeFormatter.ofPattern("MMMM, d yy", Locale.UK), "February, 23 21"),
                Arguments.of(LocalDate.of(2017, Month.APRIL,15), DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.US), "April 15 2017"),
                Arguments.of(LocalDate.of(2015, Month.JANUARY, 25),DateTimeFormatter.ofPattern("MMMM dd yyyy", Locale.CANADA), "January 25 2015")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForFormatLocalDateWithString")
    public void getFormatLdWithString(LocalDate localDate, DateTimeFormatter formatter, String expected) {
        String actual = dateWrapper.formatLocalDateWithString(localDate, formatter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsForFormatLocalDateWithLocalDate() {
        return Stream.of(
                Arguments.of("15.05.2015", "dd.MM.yyyy", LocalDate.of(2015, 5,15)),
                Arguments.of("11 ноября 2022", "dd MMMM yyyy", LocalDate.of(2022, 11, 11)),
                Arguments.of("мая, 12, 2017", "MMMM, dd, yyyy", LocalDate.of(2017,Month.MAY,12))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForFormatLocalDateWithLocalDate")
    public void getFormatLocalDateWithLocalDate(String localDate, DateTimeFormatter formatter, LocalDate expected) {
        LocalDate actual = dateWrapper.formatLocalDateWithLocalDate(localDate, formatter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsForDayAmountBetweenTwoDates() {
        return Stream.of(
                Arguments.of(LocalDate.of(2003,3,1), LocalDate.of(2004,5,1),"P1Y2M"),
                Arguments.of(LocalDate.of(2015,5,10), LocalDate.of(2017,4,5), "P1Y10M26D"),
                Arguments.of(LocalDate.of(2017,4,23), LocalDate.of(2017,8,20), "P3M28D")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsForDayAmountBetweenTwoDates")
    public void getDayAmountBetweenTwoDates(LocalDate firstDate, LocalDate secondDate, Period expected) {
        Period actual = dateWrapper.dayAmountBetweenTwoDates(firstDate, secondDate);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgsCountDaysBetweenTwoDates() {
        return Stream.of(
                Arguments.of(LocalDate.of(2003,3,1), LocalDate.of(2003,3,25), 24),
                Arguments.of(LocalDate.of(2022,10,17), LocalDate.of(2022,11,5), 19),
                Arguments.of(LocalDate.of(2021,1,1), LocalDate.of(2022,1,3), 367)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgsCountDaysBetweenTwoDates")
    public void getCountDays(LocalDate firstDate, LocalDate secondDate, long expected) {
        long actual = dateWrapper.countDaysBetweenTwoDates(firstDate, secondDate);

        Assertions.assertEquals(expected, actual);
    }
}
