package com.rakovets.course.javabasics.practice.operators;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestTask07 extends StandardOutputTest {
    @Test
    void test1() {
        Task07.main(new String[]{"20"});
        assertEquals("314.1592653589793", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task07.main(new String[]{"4"});
        assertEquals("12.566370614359172", getStandardOutputContent());
    }
}