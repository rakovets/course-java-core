package com.rakovets.course.javabasics.practice.operators;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task04Test extends StandardOutputTest {
    @Test
    void test1() {
        Task04.main(new String[]{"2"});
        assertEquals("680.58", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task04.main(new String[]{"0.1"});
        assertEquals("34.029003", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task04.main(new String[]{"0"});
        assertEquals("0.0", getStandardOutputContent());
    }
}