package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task01Test {
    Task01 task01 = new Task01();

    static Stream<Arguments> provideArgumentsGetLocalDate() {
        return Stream.of(
                Arguments.of(1999, 9, 10, LocalDate.of(1999, 9, 10)),
                Arguments.of(2000, 2, 8, LocalDate.of(2000, 2, 8)),
                Arguments.of(2022, 10, 30, LocalDate.of(2022, 10, 30))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetLocalDate")
    void getLocalDate(int year, int month, int day, LocalDate expected) {
        LocalDate actual = task01.getLocalDate(year, month, day);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsDateAfterNMonths() {
        return Stream.of(
                Arguments.of(LocalDate.of(1999, 9, 10), 3,
                        LocalDate.of(1999, 12, 10)),
                Arguments.of(LocalDate.of(2000, 2, 8), 6,
                        LocalDate.of(2000, 8, 8)),
                Arguments.of(LocalDate.of(2000, 2, 8), -1,
                        LocalDate.of(2000, 1, 8)),
                Arguments.of(LocalDate.of(2022, 10, 30), 0,
                        LocalDate.of(2022, 10, 30))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsDateAfterNMonths")
    void dateAfterNMonths(LocalDate localDate, int nMonths, LocalDate expected) {
        LocalDate actual = task01.dateAfterNMonths(localDate, nMonths);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetStringFromPattern() {
        return Stream.of(
                Arguments.of(LocalDate.of(1999, 9, 10), "yyyy-dd MMMM",
                        "1999-10 September"),
                Arguments.of(LocalDate.of(2000, 2, 8), "dd-M-yyyy",
                        "08-2-2000"),
                Arguments.of(LocalDate.of(2022, 10, 30), "MMMM dd-yyyy",
                        "October 30-2022")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetStringFromPattern")
    void getStringFromPattern(LocalDate localDate, String pattern, String expected) {
        String actual = task01.getStringFromPattern(localDate, pattern);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetLocalDateFromPattern() {
        return Stream.of(
                Arguments.of("1999.10 September", "yyyy.dd MMMM", LocalDate.of(1999, 9, 10)),
                Arguments.of("08.02.2000", "dd.MM.yyyy", LocalDate.of(2000, 2, 8)),
                Arguments.of("October 30.2022", "MMMM dd.yyyy", LocalDate.of(2022, 10, 30))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetLocalDateFromPattern")
    void getLocalDateFromPattern(String date, String dtf, LocalDate expected) {
        LocalDate actual = task01.getLocalDateFromPattern(date, dtf);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsGetDaysBetween() {
        return Stream.of(
                Arguments.of(LocalDate.of(1999, 9, 10), LocalDate.of(1999, 9, 29),
                        19),
                Arguments.of(LocalDate.of(2000, 2, 8), LocalDate.of(2000, 3, 8),
                        29),
                Arguments.of(LocalDate.of(2022, 10, 30), LocalDate.of(2022, 11, 12),
                        13)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetDaysBetween")
    void getDaysBetween(LocalDate localDate1, LocalDate localDate2, int expected) {
        int actual = task01.getDaysBetween(localDate1, localDate2);

        assertEquals(expected, actual);
    }
}
