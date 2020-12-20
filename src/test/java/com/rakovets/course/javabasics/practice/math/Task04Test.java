package com.rakovets.course.javabasics.practice.math;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task04Test extends StandardOutputTest {
    @Test
    void test1() {
        Task04.main(new String[]{"20"});
        assertEquals("314.1592653589793", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task04.main(new String[]{"4"});
        assertEquals("12.566370614359172", getStandardOutputContent());
    }
}