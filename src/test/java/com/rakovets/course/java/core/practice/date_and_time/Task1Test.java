package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


public class Task1Test {

    @Test
    void adjustInto() {
        LocalDate expected = LocalDate.of(2021, 5, 27);
        Task1 near = new Task1();

        LocalDate local = LocalDate.of(2021, 5, 17);

        Assertions.assertEquals(expected, near.adjustInto(local));
    }
}
