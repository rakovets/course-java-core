package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.project_task_01.DateAndTimeUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;

public class TestsTasks01_02 {
    DateAndTimeUtilities dtu = new DateAndTimeUtilities();

    static Stream<Arguments> provideArgumentsForGetLocalDate() {
        return Stream.of(
                Arguments.of(2022, 11, 2, "2022-11-02"),
                Arguments.of(1999, 11, 2, "1999-11-02"),
                Arguments.of(2022, 1, 2, "2022-01-02"),
                Arguments.of(2022, 11, 12, "2022-11-12"),
                Arguments.of(1, 1, 1, "0001-01-01")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetLocalDate")
    public void testGetLocalDate(int year, int months, int day, String expectedDate) {
        String actualDate = dtu.getLocalDate(year, months, day).toString();

        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> provideArgumentsForGetLocalDatePlusNMonths() {
        return Stream.of(
                Arguments.of(0, "2022-11-02"),
                Arguments.of(1, "2022-12-02"),
                Arguments.of(2, "2023-01-02"),
                Arguments.of(12, "2023-11-02")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetLocalDatePlusNMonths")
    public void testGetLocalDatePlusNMonths(int months, String expectedDate) {
        LocalDate localDate = LocalDate.of(2022, 11, 2);

        String actualDate = dtu.getLocalDatePlusNMonths(localDate, months).toString();

        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> provideArgumentsForGetDateFormatted() {
        return Stream.of(
                Arguments.of("dd-MM-yy", "12-11-22"),
                Arguments.of("MM-yy", "11-22"),
                Arguments.of("dd MMMM yy", "12 November 22"),
                Arguments.of("dd M yy", "12 11 22"),
                Arguments.of("d M y", "12 11 2022"),
                Arguments.of("'D': dd/MM/yyyy", "D: 12/11/2022"),
                Arguments.of("dd/MMM/yy", "12/Nov/22")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetDateFormatted")
    public void testGetDateFormatted(String pattern, String expectedDate) {
        LocalDate localDate = LocalDate.of(2022, 11, 12);

        String actualDate = dtu.getDateFormatted(localDate, DateTimeFormatter.ofPattern(pattern, Locale.US));

        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> provideArgumentsForGetLocalDateByStringAndFormatter() {
        return Stream.of(
                Arguments.of("dd-MM-yy", "12-11-22", "2022-11-12"),
                Arguments.of("dd MMMM yy", "12 November 22", "2022-11-12"),
                Arguments.of("dd M yy", "12 11 22", "2022-11-12"),
                Arguments.of("d M y", "12 11 2022", "2022-11-12"),
                Arguments.of("'D': dd/MM/yyyy", "D: 12/11/2022", "2022-11-12"),
                Arguments.of("dd/MMM/yy", "12/Nov/22", "2022-11-12")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetLocalDateByStringAndFormatter")
    public void testGetLocalDateByStringAndFormatter(String pattern, String localDateString, String expectedDate) {
        LocalDate localDate = LocalDate.of(2022, 11, 12);

        String actualDate = dtu.getLocalDateByStringAndFormatter(localDateString, DateTimeFormatter.ofPattern(pattern, Locale.US)).toString();

        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> provideArgumentsForGetPeriodBetweenTwoLocaleDate() {
        return Stream.of(
                Arguments.of(2022, 11, 2, "P0D"),
                Arguments.of(2022, 11, 3, "P-1D"),
                Arguments.of(2022, 11, 1, "P1D"),
                Arguments.of(2022, 12, 2, "P-1M"),
                Arguments.of(2022, 10, 2, "P1M"),
                Arguments.of(2023, 11, 2, "P-1Y"),
                Arguments.of(2021, 11, 2, "P1Y"),
                Arguments.of(2023, 12, 3, "P-1Y-1M-1D"),
                Arguments.of(2021, 10, 1, "P1Y1M1D")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForGetPeriodBetweenTwoLocaleDate")
    public void testGetPeriodBetweenTwoLocaleDate(int year, int months, int day, String expectedDate) {
        LocalDate localDate = LocalDate.of(2022, 11, 2);

        String actualDate = dtu.getPeriodBetweenTwoLocaleDate(LocalDate.of(year, months, day), localDate).toString();

        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> provideArgumentsForAdjustIntoPlusDays() {
        return Stream.of(
                Arguments.of(1, "2022-11-03"),
                Arguments.of(10, "2022-11-12"),
                Arguments.of(30, "2022-12-02"),
                Arguments.of(365, "2023-11-02")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForAdjustIntoPlusDays")
    public void testAdjustIntoPlusDays(int daysPlus, String expectedDate) {
        LocalDate localDate = LocalDate.of(2022, 11, 2);

        String actualDate = localDate.with(new DateAndTimeUtilities(daysPlus)::adjustInto).toString();

        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> provideArgumentsForAdjustIntoToTheNearestFirstDayOfYear() {
        return Stream.of(
                Arguments.of(2022, 11, 2, "2023-01-01"),
                Arguments.of(2022, 07, 3, "2023-01-01"),
                Arguments.of(2022, 07, 2, "2022-01-01"),
                Arguments.of(2022, 01, 2, "2022-01-01")
        );
    }
    @ParameterizedTest
    @MethodSource("provideArgumentsForAdjustIntoToTheNearestFirstDayOfYear")
    public void testAdjustIntoToTheNearestFirstDayOfYear(int year, int months, int day, String expectedDate) {
        LocalDate localDate = LocalDate.of(2022, 11, 2);

        String actualDate = LocalDate.of(year, months, day).with(dtu::adjustInto).toString();

        Assertions.assertEquals(expectedDate, actualDate);
    }
}
