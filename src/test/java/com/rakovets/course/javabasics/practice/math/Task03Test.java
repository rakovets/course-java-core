package com.rakovets.course.javabasics.practice.math;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task03Test extends StandardOutputTest {
    @Test
    void test1() {
        Task03.main(new String[]{"0.1"});
        assertEquals("0", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task03.main(new String[]{"0.5"});
        assertEquals("1", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task03.main(new String[]{"1.0"});
        assertEquals("1", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task03.main(new String[]{"1.2"});
        assertEquals("1", getStandardOutputContent());
    }

    @Test
    void test5() {
        Task03.main(new String[]{"1.9"});
        assertEquals("2", getStandardOutputContent());
    }
}