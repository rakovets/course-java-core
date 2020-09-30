package com.rakovets.course.javabasics.practice.math;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class Task01Test extends StandardOutputTest {
    @Test
    void test1() {
        Task01.main(new String[]{"1", "2"});
        assertEquals("1", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task01.main(new String[]{"2", "1"});
        assertEquals("1", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task01.main(new String[]{"3", "2"});
        assertEquals("2", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task01.main(new String[]{"-3", "2"});
        assertEquals("-3", getStandardOutputContent());
    }

    @Test
    void test5() {
        Task01.main(new String[]{"-3", "-2"});
        assertEquals("-3", getStandardOutputContent());
    }

    @Test
    void test6() {
        Task01.main(new String[]{"3", "-2"});
        assertEquals("-2", getStandardOutputContent());
    }
}