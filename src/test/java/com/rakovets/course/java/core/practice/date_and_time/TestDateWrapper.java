package com.rakovets.course.java.core.practice.date_and_time;

import com.rakovets.course.java.core.practice.date_and_time.date_wrapper.DateWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

public class TestDateWrapper {
    static Stream<Arguments> provideFromGetLocalDate() {
        return Stream.of(Arguments.of(2014, 4, 25, LocalDate.of(2014, 4, 25)),
                Arguments.of(2017, 5, 12, LocalDate.of(2017, 5, 12)));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetLocalDate")
    public void getLocalDate(Integer year, Integer month, Integer day, LocalDate expected) {
        DateWrapper dateWrapper = new DateWrapper();

        LocalDate actual = dateWrapper.getLocalDate(year, month, day);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetAmountDay() {
        return Stream.of(Arguments.of(LocalDate.of(2014, 4, 25)
                        , LocalDate.of(2017, 5, 12), 1113),
                Arguments.of(LocalDate.of(2014, 4, 25)
                        , LocalDate.of(2014, 4, 27), 2));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetAmountDay")
    public void getLocalDate(LocalDate localDate, LocalDate localDate1, int expected) {
        DateWrapper dateWrapper = new DateWrapper();

        int actual = dateWrapper.getAmountDay(localDate, localDate1);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetLocalDateAfterSeveralMonth() {
        return Stream.of(Arguments.of(LocalDate.of(2014, 4, 25),
                        5, LocalDate.of(2014, 9, 25)),
                Arguments.of(LocalDate.of(2014, 4, 25),
                        3, LocalDate.of(2014, 7, 25)));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetLocalDateAfterSeveralMonth")
    public void getLocalDateAfterSeveralMonth(LocalDate localDate, Integer month, LocalDate expected) {
        DateWrapper dateWrapper = new DateWrapper();

        LocalDate actual = dateWrapper.getLocalDateAfterSeveralMonth(localDate, month);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetFormatPattern() {
        return Stream.of(Arguments.of(LocalDate.of(2014, 4, 25),
                        "MMMM, dd, yyyy", "April, 25, 2014"),
                Arguments.of(LocalDate.of(2017, 5, 12),
                        "dd, M, yyyy", "12, 5, 2017"));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetFormatPattern")
    public void getFormatPattern(LocalDate localDate, String pattern, String expected) {
        DateWrapper dateWrapper = new DateWrapper();

        String actual = dateWrapper.getFormatPattern(localDate, pattern);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideFromGetStringFormat() {
        return Stream.of(Arguments.of("апреля, 25, 2014",
                        DateTimeFormatter.ofPattern("MMMM, dd, yyyy"),
                        LocalDate.of(2014, 4, 25)),
                Arguments.of("12, 5, 2017",
                        DateTimeFormatter.ofPattern("dd, M, yyyy"),
                        LocalDate.of(2017, 5, 12)));
    }

    @ParameterizedTest
    @MethodSource("provideFromGetStringFormat")
    public void getStringFormat(String localDate, DateTimeFormatter dateTimeFormatter, LocalDate expected) {
        DateWrapper dateWrapper = new DateWrapper();

        LocalDate actual = dateWrapper.getStringFormat(localDate, dateTimeFormatter);

        Assertions.assertEquals(expected, actual);
    }
}
