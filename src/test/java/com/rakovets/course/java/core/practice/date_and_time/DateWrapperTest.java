package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
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
        String pattern1 = "MMMM, dd, yyyy";
        String pattern2 = "MM, dd, yy";

        return Stream.of(
                Arguments.of(LocalDate.of(2021, 5, 2), pattern1, "May, 02, 2021"),
                Arguments.of(LocalDate.of(2012, 1, 21), pattern1, "January, 21, 2012"),
                Arguments.of(LocalDate.of(2021, 5, 2), pattern2, "05, 02, 21"),
                Arguments.of(LocalDate.of(2012, 1, 21), pattern2, "01, 21, 12")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetStringWithDate")
    void getStringWithDateTest(LocalDate date, String pattern, String expected) {
        String actual = DateWrapper.getStringWithDate(date, pattern);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForMakeLocalDateFromString() {
        String pattern1 = "MMMM, dd, yyyy";
        String pattern2 = "MM, dd, yy";

        return Stream.of(
                Arguments.of("May, 02, 2021", pattern1, LocalDate.of(2021, 5, 2)),
                Arguments.of("January, 21, 2012", pattern1, LocalDate.of(2012, 1, 21)),
                Arguments.of("05, 02, 21", pattern2, LocalDate.of(2021, 5, 2)),
                Arguments.of("01, 21, 12", pattern2, LocalDate.of(2012, 1, 21))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForMakeLocalDateFromString")
    void makeLocalDateFromStringTest(String str, String pattern, LocalDate expected) {
        LocalDate actual = DateWrapper.makeLocalDateFromString(str, pattern);
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
        LocalDate actual = date1.with(new DateCorrectionByDays(days));
        Assertions.assertEquals(expected, actual);
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
        LocalDate actual = date1.with(new DateCorrection());
        Assertions.assertEquals(expected, actual);
    }
}
