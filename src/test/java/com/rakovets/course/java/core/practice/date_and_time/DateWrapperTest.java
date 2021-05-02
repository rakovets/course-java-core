package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Locale;
import java.util.stream.Stream;

public class DateWrapperTest {
    static Stream<Arguments> provideArgumentsForGetLocalDate() {
        return Stream.of(
                Arguments.of(2021, 5, 2, LocalDate.of(2021, 5, 2)),
                Arguments.of(2002, 10, 2, LocalDate.of(2002, 10, 2)),
                Arguments.of(2021, 5, 31, LocalDate.of(2021, 5, 31)),
                Arguments.of(2010, 12, 1, LocalDate.of(2010, 12, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetLocalDate")
    void getLocalDateTest(int year, int month, int day, LocalDate expected){
        LocalDate actual = DateWrapper.getLocalDate(year, month, day);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetLocalDateWithChangedMonth() {
        return Stream.of(
                Arguments.of(LocalDate.of(2021, 5, 2), 1, LocalDate.of(2021, 6, 2)),
                Arguments.of(LocalDate.of(2010, 1, 21), 9, LocalDate.of(2010, 10, 21)),
                Arguments.of(LocalDate.of(2021, 12, 2), 1, LocalDate.of(2022, 1, 2)),
                Arguments.of(LocalDate.of(2021, 5, 2), 12, LocalDate.of(2022, 5, 2))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetLocalDateWithChangedMonth")
    void getLocalDateWithChangedMonthTest(LocalDate date, int months, LocalDate expected) {
        LocalDate actual = DateWrapper.getLocalDateWithChangedMonth(date, months);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetStringWithDate() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM, dd, yyyy", Locale.UK);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM, dd, yy", Locale.UK);

        return Stream.of(
                Arguments.of(LocalDate.of(2021, 5, 2), formatter1, "May, 02, 2021"),
                Arguments.of(LocalDate.of(2012, 1, 21), formatter1, "January, 21, 2012"),
                Arguments.of(LocalDate.of(2021, 5, 2), formatter2, "05, 02, 21"),
                Arguments.of(LocalDate.of(2012, 1, 21), formatter2, "01, 21, 12")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetStringWithDate")
    void getStringWithDateTest(LocalDate date, DateTimeFormatter formatter, String expected) {
        String actual = DateWrapper.getStringWithDate(date, formatter);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMakeLocalDateFromString() {
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MMMM, dd, yyyy", Locale.UK);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM, dd, yy", Locale.UK);

        return Stream.of(
                Arguments.of("May, 02, 2021", formatter1, LocalDate.of(2021, 5, 2)),
                Arguments.of("January, 21, 2012", formatter1, LocalDate.of(2012, 1, 21)),
                Arguments.of("05, 02, 21", formatter2, LocalDate.of(2021, 5, 2)),
                Arguments.of("01, 21, 12", formatter2, LocalDate.of(2012, 1, 21))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMakeLocalDateFromString")
    void makeLocalDateFromStringTest(String str, DateTimeFormatter formatter, LocalDate expected) {
        LocalDate actual = DateWrapper.makeLocalDateFromString(str, formatter);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetNumberDayBetweenTwoDates() {
        return Stream.of(
                Arguments.of(LocalDate.of(2021, 5, 1), LocalDate.of(2021, 5, 2), 1),
                Arguments.of(LocalDate.of(2021, 5, 11), LocalDate.of(2021, 5, 21), 10),
                Arguments.of(LocalDate.of(2021, 5, 1), LocalDate.of(2021, 6, 29), 28),
                Arguments.of(LocalDate.of(2021, 4, 30), LocalDate.of(2022, 5, 1), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetNumberDayBetweenTwoDates")
    void getNumberDayBetweenTwoDatesTest(LocalDate date1, LocalDate date2, int expected) {
        int actual = DateWrapper.getNumberDayBetweenTwoDates(date1, date2);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAdjustInto() {
        return Stream.of(
                Arguments.of(LocalDate.of(2021, 5, 1), 1, LocalDate.of(2021, 5, 2)),
                Arguments.of(LocalDate.of(1997, 5, 11), 2, LocalDate.of(1997, 5, 13)),
                Arguments.of(LocalDate.of(2025, 5, 1), 3, LocalDate.of(2025, 5, 4)),
                Arguments.of(LocalDate.of(2010, 4, 30), 4, LocalDate.of(2010, 5, 4))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAdjustInto")
    void getAdjustIntoTest(LocalDate date1, int days, LocalDate expected) {
        Temporal actual = DateWrapper.adjustInto(date1, days);
        Assertions.assertEquals(expected, (LocalDate) actual);
    }

    static Stream<Arguments> provideArgumentsForAdjustIntoAboutLeapYear() {
        return Stream.of(
                Arguments.of(LocalDate.of(2021, 5, 1), LocalDate.of(2021, 1, 1)),
                Arguments.of(LocalDate.of(2021, 10, 11), LocalDate.of(2022, 1, 1)),
                Arguments.of(LocalDate.of(2020, 7, 2), LocalDate.of(2021, 1, 1)),
                Arguments.of(LocalDate.of(2021, 7, 2), LocalDate.of(2021, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAdjustIntoAboutLeapYear")
    void getAdjustIntoAboutLeapYearTest(LocalDate date1, LocalDate expected) {
        Temporal actual = DateWrapper.adjustInto(date1);
        Assertions.assertEquals(expected, (LocalDate) actual);
    }
}
