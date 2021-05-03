package com.rakovets.course.java.core.practice.date_and_time.data_wrapper;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.stream.Stream;

class DataUtilTest {

    static Stream<Arguments> provideArgumentsForGetData() {
        return Stream.of(
                Arguments.of(2021, 5, 7, LocalDate.of(2021, 5, 7)),
                Arguments.of(2000, 2, 29, LocalDate.of(2000, 2, 29))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetData")
    void getDataTest(int year, int month, int day, LocalDate expected) {
        LocalDate actual = DataUtil.getDate(year, month, day);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForRewindMonth() {
        return Stream.of(
                Arguments.of(5, LocalDate.of(2020, 5, 25),
                        LocalDate.of(2020, 10, 25)),
                Arguments.of(7, LocalDate.of(2020, 7, 20),
                        LocalDate.of(2021, 2, 20))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForRewindMonth")
    void rewindMonthTest(int month, LocalDate userDate, LocalDate expected) {
        LocalDate actual = DataUtil.rewindMonth(userDate, month);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPatternDateReturnString() {
        return Stream.of(
                Arguments.of(LocalDate.of(2020, 10, 15), "yyyy/MM/dd", "2020/10/15"),
                Arguments.of(LocalDate.of(2000, 3, 10), "dd-MMMM-yyyy", "10-March-2000"),
                Arguments.of(LocalDate.of(1995, 4, 23), "MMM-dd-yyyy", "Apr-23-1995")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPatternDateReturnString")
    void isPatternDateTest(LocalDate userDate, String datePattern, String expected) {
        String actual = DataUtil.isPatternDate(userDate, datePattern);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForPatternDateReturnLocalDate() {
        return Stream.of(
                Arguments.of("22/10/2020", "dd/MM/yyyy", LocalDate.of(2020, 10, 22)),
                Arguments.of("Apr-10-2000", "MMM-dd-yyyy", LocalDate.of(2000, 4, 10))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForPatternDateReturnLocalDate")
    void isPatternDateTest(String userDate, String datePattern, LocalDate expected) {
        LocalDate actual = DataUtil.isPatternDate(userDate, datePattern);
        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForTimeInterval() {
        return Stream.of(
                Arguments.of(LocalDate.of(2020, 5, 5),
                        LocalDate.of(2021, 5, 5), 365),
                Arguments.of(LocalDate.of(2000, 5, 5),
                        LocalDate.of(2004, 5, 5), 4 * 365 + 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTimeInterval")
    void isTimeIntervalTest(LocalDate date1, LocalDate date2, long expected) {
        long actualInterval = DataUtil.isTimeInterval(date1, date2);
        Assertions.assertEquals(actualInterval, expected);
    }

    static Stream<Arguments> provideArgumentsForAdjustIntoFirstJanuary() {
        return Stream.of(
                Arguments.of(LocalDate.of(2001, 7, 2),
                        LocalDate.of(2001, 1, 1)),
                Arguments.of(LocalDate.of(2001, 7, 3),
                        LocalDate.of(2002, 1, 1))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAdjustIntoFirstJanuary")
    void AdjustIntoTest(Temporal date, LocalDate expected) {
        Temporal actual = DataUtil.adjustInto(date);
        Assertions.assertEquals(actual, expected);
    }

    static Stream<Arguments> provideArgumentsForAdjustIntoDay() {
        return Stream.of(
                Arguments.of(LocalDate.of(2001, 7, 2), 10,
                        LocalDate.of(2001, 7, 12)),
                Arguments.of(LocalDate.of(2001, 7, 20), 20,
                        LocalDate.of(2001, 8, 9))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAdjustIntoDay")
    void AdjustIntoTest(Temporal date, int plusDay, LocalDate expected) {
        Temporal actual = DataUtil.adjustInto(date, plusDay);
        Assertions.assertEquals(actual, expected);
    }
}
