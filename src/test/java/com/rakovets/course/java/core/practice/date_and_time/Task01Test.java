package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class Task01Test {

    @Test
    void getLocalDate() {
        LocalDate expected = LocalDate.of(2015, 12,15);

        LocalDate actual = Task01.getLocalDate(2015, 12, 15);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDatePlusNumberOfMonth() {
        LocalDate local = LocalDate.of(2020, 3, 5);
        LocalDate expected = LocalDate.of(2020, 5, 5);

        LocalDate actual = Task01.getDatePlusNumberOfMonth(local, 2);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getStringOfPattern() {
        LocalDate local = LocalDate.of(2020, 3, 5);
        String expected = "05 03 2020";

        String actual = Task01.getStringOfPattern(local, "dd MM yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getLocalDateOfPattern() {
        LocalDate expected = LocalDate.of(2020, 3, 5);

        LocalDate actual = Task01.getLocalDateOfPattern("05 03 2020", "dd MM yyyy");

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getDays() {
        int expected = 10;

        int actual = Task01.getDays(LocalDate.of(2020, 3, 5), LocalDate.of(2020, 3, 15));

        Assertions.assertEquals(expected, actual);
    }
}
