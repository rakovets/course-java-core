package com.rakovets.course.javabasics.practice.operators;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestTask01 extends StandardOutputTest {
    @Test
    void test1() {
        Task01.main(new String[]{"2", "2"});
        assertEquals("1", getStandardOutputContentWithTrim());
    }

    @Test
    void test2() {
        Task01.main(new String[]{"9", "1"});
        assertEquals("9", getStandardOutputContentWithTrim());
    }

    @Test
    void test3() {
        Task01.main(new String[]{"5", "2"});
        assertEquals("2", getStandardOutputContentWithTrim());
    }

    @Test
    void test4() {
        Task01.main(new String[]{"20", "50"});
        assertEquals("0", getStandardOutputContentWithTrim());
    }
}