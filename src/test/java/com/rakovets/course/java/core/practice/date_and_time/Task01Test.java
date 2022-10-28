package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.Task01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

public class Task01Test {
    Task01 dateWrapper = new Task01();

    static Stream<Arguments> provideArgumentsForReturnDate() {
        return Stream.of(
                Arguments.of(1991, 12, 12, "1991-12-12"),
                Arguments.of(1643, 1, 7, "1643-01-07"),
                Arguments.of(1888, 6, 6, "1888-06-06"),
                Arguments.of(2022, 10, 25, "2022-10-25"),
                Arguments.of(2073, 7, 30, "2073-07-30")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReturnDate")
    void testReturnDate(int year, int month, int day, String expected) {
        LocalDate actual = dateWrapper.returnDate(year, month, day);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForReturnDateAfterMonths() {
        return Stream.of(
                Arguments.of(LocalDate.of(1991, 12, 12), 12, "1992-12-12"),
                Arguments.of(LocalDate.of(1643, 1, 7), 3, "1643-04-07"),
                Arguments.of(LocalDate.of(1888, 6, 6), 16, "1889-10-06"),
                Arguments.of(LocalDate.of(2022, 10, 25), 6, "2023-04-25"),
                Arguments.of(LocalDate.of(2073, 7, 30), 23, "2075-06-30")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReturnDateAfterMonths")
    void testReturnDateAfterMonths(LocalDate date, int numberMonths, String expected) {
        LocalDate actual = dateWrapper.returnDateAfterMonths(date, numberMonths);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForReturnStringDateByPattern() {
        return Stream.of(
                Arguments.of(LocalDate.of(1991, 12, 12),"yyyy-MMMM-dd",
                        "1991-December-12"),
                Arguments.of(LocalDate.of(1643, 1, 7), "dd-MM-yyyy",
                        "07-01-1643"),
                Arguments.of(LocalDate.of(1888, 6, 6), "yyyy-MM-dd",
                        "1888-06-06"),
                Arguments.of(LocalDate.of(2022, 10, 25), "yyyy-MMM-dd",
                        "2022-Oct-25"),
                Arguments.of(LocalDate.of(2073, 7, 30), "MMM-dd-yyyy",
                        "Jul-30-2073")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReturnStringDateByPattern")
    void testReturnStringDateByPattern(LocalDate date, String pattern, String expected) {
        String actual = dateWrapper.returnStringDateByPattern(date, pattern);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForReturnDateByPattern() {
        return Stream.of(
                Arguments.of("June 5 2018","MMMM d yyyy",
                        "2018-06-05"),
                Arguments.of("Aug 1999 18", "MMM yyyy dd",
                        "1999-08-18"),
                Arguments.of("21 April, 2000", "dd MMMM, yyyy",
                        "2000-04-21"),
                Arguments.of("3.12.03", "d.MM.yy",
                        "2003-12-03"),
                Arguments.of("1820, Oct, 30", "yyyy, MMM, dd",
                        "1820-10-30")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReturnDateByPattern")
    void testReturnDateByPattern(String date, String pattern, String expected) {
        LocalDate actual = dateWrapper.returnDateByPattern(date, pattern);

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForReturnNumberDaysBetweenDates() {
        return Stream.of(
                Arguments.of(LocalDate.of(1991, 12, 12),
                        LocalDate.of(1991, 12, 12), 0),
                Arguments.of(LocalDate.of(1723, 3, 28),
                        LocalDate.of(1995, 1, 5), 99264),
                Arguments.of(LocalDate.of(1601, 1, 11),
                        LocalDate.of(1905, 6, 11), 111184),
                Arguments.of(LocalDate.of(1, 1, 1),
                        LocalDate.of(2022, 10, 10), 738437),
                Arguments.of(LocalDate.of(1579, 5, 1),
                        LocalDate.of(1579, 5, 2), 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForReturnNumberDaysBetweenDates")
    void testReturnNumberDaysBetweenDates(LocalDate date1, LocalDate date2, long expected) {
        long actual = dateWrapper.returnNumberDaysBetweenDates(date1, date2);

        Assertions.assertEquals(expected, actual);
    }
}
