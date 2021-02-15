package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class DateWrapperTest {

    @Test
    void getLocalDate() {
        LocalDate actualLocalDate = DateWrapper.getLocalDate(2020,10,5);
        assertEquals(LocalDate.of(2020,10,5),actualLocalDate);
    }

    @Test
    void getLocalDateAfterPlusMount() {
        LocalDate actualLocalDate = DateWrapper.getLocalDateAfterPlusMount(LocalDate.now(),5);
        assertEquals(LocalDate.of(2021,7,15),actualLocalDate);
    }

    @Test
    void getStringDateTime() {
        String actualStringLocalDate = DateWrapper.getStringDateTime(LocalDate.of(2021,10,5),DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        assertEquals("05-10-2021",actualStringLocalDate);
    }

    @Test
    void getLocalDateFromString() {
        LocalDate actualLocalDateString = DateWrapper.getLocalDateFromString("05-10-2021",DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        assertEquals(LocalDate.of(2021,10,5),actualLocalDateString);
    }

    @Test
    void getDaysBetween() {
        LocalDate localDate1 = LocalDate.of(2021,10,5);
        LocalDate localDate2 = LocalDate.of(2021,10,20);
        long actualDays = DateWrapper.getDaysBetween(localDate1,localDate2);
        assertEquals(15,actualDays);
    }

    @Test
    void getAddDays() {
        LocalDate localDate1 = DateWrapper.getLocalDate(2021, 10, 5);
        assertEquals("2021-10-15", localDate1.with(DateWrapper.getAddDays(10)).toString());
    }
}
