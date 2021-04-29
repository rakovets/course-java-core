package com.rakovets.course.java.core.practice.date_and_time.data_wrapper;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class DataUtilTest {

    @Test
    void findNearFirstFebruary() {
        assertEquals(DataUtil.findNearFirstFebruary(LocalDate.of(2000, 7, 3)),
                LocalDate.of(2001, 1, 1));

    }

}
