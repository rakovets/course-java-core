package com.rakovets.course.java.core.practice.date_and_time.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.DateWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.stream.Stream;

public class DateWrapperTest {

    @Test
    void getLocalDate() {
        LocalDate expectedDate = LocalDate.of(2020, 6, 23);

        LocalDate actualDate = DateWrapper.getLocalDate(2020, 6, 23);

        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> nextDateProvideArguments() {
        return Stream.of(
                Arguments.of("2021-01-13", 5, LocalDate.of(2020, 8, 13)),
                Arguments.of("2020-12-13", 1, LocalDate.of(2020, 11, 13)),
                Arguments.of("2020-08-13", 0, LocalDate.of(2020, 8, 13))

        );
    }

    @ParameterizedTest
    @MethodSource("nextDateProvideArguments")
    void nextDate(String expectedString, int month, LocalDate date) {

        String actualString = DateWrapper.nextDate(date, month).toString();

        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> getDateByPatternProvideArguments() {
        return Stream.of(
                Arguments.of("13-08-2020", LocalDate.of(2020, 8, 13), DateTimeFormatter.ofPattern("dd-MM-yyyy")),
                Arguments.of("01-26-1999", LocalDate.of(1999, 1, 26), DateTimeFormatter.ofPattern("MM-d-yyyy")),
                Arguments.of("2-12-2007", LocalDate.of(2007, 12, 2), DateTimeFormatter.ofPattern("d-MM-yyyy")),
                Arguments.of("2007-12-02", LocalDate.of(2007, 12, 2), DateTimeFormatter.ofPattern("yyyy-MM-dd"))
        );
    }

    @ParameterizedTest
    @MethodSource("getDateByPatternProvideArguments")
    void getDateByPattern(String expectedString, LocalDate date, DateTimeFormatter formatter ) {

        String actualString = DateWrapper.getDateByPattern(date, formatter);

        Assertions.assertEquals(expectedString, actualString);
    }

    static Stream<Arguments> getLocalDateByPatternProvideArguments() {
        return Stream.of(
                Arguments.of("13-08-2020", "dd-MM-yyyy"),
                Arguments.of("08-13-2020", "MM-d-yyyy"),
                Arguments.of("13-08-2020", "d-MM-yyyy"),
                Arguments.of("2020-08-13", "yyyy-MM-d")
        );
    }

    @ParameterizedTest
    @MethodSource("getLocalDateByPatternProvideArguments")
    void getLocalDateByPattern(String str, String pattern) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern, Locale.US);

        LocalDate actualDate = DateWrapper.getLocalDateByPattern(str, formatter);

        Assertions.assertEquals(LocalDate.of(2020, 8, 13), actualDate);
    }

    static Stream<Arguments> getDaysCountProvideArguments() {
        return Stream.of(
                Arguments.of(8, LocalDate.of(2020, 8, 10), LocalDate.of(2020, 8, 2)),
                Arguments.of(221, LocalDate.of(2020, 9, 10), LocalDate.of(2020, 2, 2)),
                Arguments.of(357, LocalDate.of(2020, 8, 10), LocalDate.of(2021, 8, 2))

        );
    }

    @ParameterizedTest
    @MethodSource("getDaysCountProvideArguments")
    void getDaysCount(long expectedLong, LocalDate date1, LocalDate date2) {

        long actualLong = DateWrapper.getDaysCount(date1, date2);

        Assertions.assertEquals(expectedLong, actualLong);
    }

    static Stream<Arguments> addDaysProvideArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2020, 8, 10), LocalDate.of(2020, 8, 2), 8),
                Arguments.of(LocalDate.of(2020, 8, 1), LocalDate.of(2020, 7, 31), 1),
                Arguments.of(LocalDate.of(2020, 8, 1), LocalDate.of(2020, 8, 1), 0),
                Arguments.of(LocalDate.of(2020, 7, 21), LocalDate.of(2020, 7, 31), -10)
        );
    }

    @ParameterizedTest
    @MethodSource("addDaysProvideArguments")
    void addDays(LocalDate expectedDate, LocalDate date1, int days) {

        LocalDate actualDate = DateWrapper.addDays(date1, days);

        Assertions.assertEquals(expectedDate, actualDate);
    }

    static Stream<Arguments> closestFirstDayProvideArguments() {
        return Stream.of(
                Arguments.of(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 5, 2)),
                Arguments.of(LocalDate.of(2021, 1, 1), LocalDate.of(2020, 7, 1)),
                Arguments.of(LocalDate.of(2020, 1, 1), LocalDate.of(2020, 6, 29)),
                Arguments.of(LocalDate.of(2021, 1, 1), LocalDate.of(2021, 6, 30))
        );
    }

    @ParameterizedTest
    @MethodSource("closestFirstDayProvideArguments")
    void closestFirstDay(LocalDate expectedDate, LocalDate date1) {

        LocalDate actualDate = DateWrapper.closestFirstDay(date1);

        Assertions.assertEquals(expectedDate, actualDate);
    }
}

