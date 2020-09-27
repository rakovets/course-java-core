package com.rakovets.course.javabasics.practice.operators;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask10 extends StandardOutputTest {
    @Test
    void test1() {
        Task10.main(new String[]{"176", "90"});
        assertEquals("24", getStandardOutputContentWithTrim());
    }

    @Test
    void test2() {
        Task10.main(new String[]{"158", "34"});
        assertEquals("-14", getStandardOutputContentWithTrim());
    }

    @Test
    void test3() {
        Task10.main(new String[]{"180", "70"});
        assertEquals("0", getStandardOutputContentWithTrim());
    }
}
