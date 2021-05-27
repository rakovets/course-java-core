package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Task2Test {
    @Test
    void adjustInto() {
        LocalDate expected = LocalDate.of(2021, 1, 1);
        Task2 near = new Task2();

        LocalDate local = LocalDate.of(2021, 5, 27);

        Assertions.assertEquals(expected, near.adjustInto(local));
    }

}
