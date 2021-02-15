package com.rakovets.course.java.core.practice.date_and_time;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class Task02Plus10daysTest {

    @Test
    void adjustInto() {
        LocalDate expected = LocalDate.of(2020, 12, 15);
        Task02Plus10days near = new Task02Plus10days();

        LocalDate local = LocalDate.of(2020, 12, 5);

        Assertions.assertEquals(expected, near.adjustInto(local));
    }
}
