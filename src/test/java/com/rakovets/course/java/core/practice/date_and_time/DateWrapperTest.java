package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

@DisplayName("DateWrapper test.")
class DateWrapperTest {
    static private DateWrapper dateWrapper;

    @BeforeAll
    static void init() {
        dateWrapper = new DateWrapper();
    }

    static Stream<Arguments> getLocalDateProviderArguments() {
        return Stream.of(
                Arguments.of(2022, 8, 9, LocalDate.of(2022, 8, 9)),
                Arguments.of(2021, 7, 12, LocalDate.of(2021, 7, 12))
        );
    }

    @ParameterizedTest(name = "Year: {0}, month: {1}, day: {2}.")
    @MethodSource("getLocalDateProviderArguments")
    @DisplayName("Get LocalDate test.")
    void getLocalDate(int year, int month, int dayOfMonth, LocalDate expected) throws DateException {
        var actual = dateWrapper.getLocalDate(year, month, dayOfMonth);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getLocalDateEnumProviderArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 8, 9), 3, ChronoUnit.MONTHS,
                        LocalDate.of(2022, 11, 9)),
                Arguments.of(LocalDate.of(2022, 8, 9), 3, ChronoUnit.DAYS,
                        LocalDate.of(2022, 8, 12)),
                Arguments.of(LocalDate.of(2022, 8, 9), 3, ChronoUnit.YEARS,
                        LocalDate.of(2025, 8, 9))
        );
    }

    @ParameterizedTest(name = "Date: {0}, value: {1}, ChronoUnit: {2}.")
    @MethodSource("getLocalDateEnumProviderArguments")
    @DisplayName("Get LocalDate with ChronoUnit.")
    void getLocalDateEnum(LocalDate localDate, int value, ChronoUnit chronoUnit, LocalDate expected)
            throws DateException {
        var actual = dateWrapper.getLocaleDate(localDate, value, chronoUnit);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> getLocalDateFormatterProviderArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 8, 9),
                        DateTimeFormatter.ofPattern("dd.MM.yyyy"), "09.08.2022"),
                Arguments.of(LocalDate.of(2022, 8, 9),
                        DateTimeFormatter.ofPattern("d.M.yy"), "9.8.22")
        );
    }

    @ParameterizedTest()
    @DisplayName("Get LocalDate with DateTimeFormatter.")
    @MethodSource("getLocalDateFormatterProviderArguments")
    void getLocalDateFormatter(LocalDate localDate, DateTimeFormatter formatter, String expected) throws DateException {
        var actual = dateWrapper.getLocaleDate(localDate, formatter);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getLocalDateFormatter() throws DateException {
        LocalDate expected = LocalDate.of(2022, 12, 3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM d yyyy");
        String date = "12 3 2022";

        LocalDate actual = dateWrapper.getLocaleDate(date, formatter);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> differenceBetweenProviderArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 8, 9),
                        LocalDate.of(2022, 8, 10), ChronoUnit.DAYS, 1),
                Arguments.of(LocalDate.of(2022, 8, 9),
                        LocalDate.of(2022, 9, 10), ChronoUnit.MONTHS, 1),
                Arguments.of(LocalDate.of(2022, 8, 9),
                        LocalDate.of(2023, 9, 10), ChronoUnit.YEARS, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("differenceBetweenProviderArguments")
    @DisplayName("Counts the amount of something between two dates.")
    void differenceBetween(LocalDate first, LocalDate second, ChronoUnit chronoUnit, long expected)
            throws DateException {
        var actual = dateWrapper.differenceBetween(first, second, chronoUnit);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> addToDateProviderArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2022, 8, 9), 45, ChronoUnit.DAYS,
                        LocalDate.of(2022, 9, 23)),
                Arguments.of(LocalDate.of(2022, 8, 9), 45, ChronoUnit.YEARS,
                        LocalDate.of(2067, 8, 9)),
                Arguments.of(LocalDate.of(2022, 8, 9), 45, ChronoUnit.MONTHS,
                        LocalDate.of(2026, 5, 9))
        );
    }

    @ParameterizedTest
    @MethodSource("addToDateProviderArguments")
    @DisplayName("Add to Date test.")
    void addToDate(LocalDate date, int value, ChronoUnit chronoUnit, LocalDate expected) throws DateException {
        var actual = dateWrapper.addToDate(date, value, chronoUnit);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> firstJanuaryProviderArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2020, 4, 5),
                        LocalDate.of(2020, 1, 1)),
                Arguments.of(LocalDate.of(2020, 9, 5),
                        LocalDate.of(2021, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("firstJanuaryProviderArguments")
    @DisplayName("Find first January.")
    void firstJanuary(LocalDate localDate, LocalDate expected) {
        var actual = dateWrapper.adjustInto(localDate);

        Assertions.assertEquals(expected, actual);
    }
}
