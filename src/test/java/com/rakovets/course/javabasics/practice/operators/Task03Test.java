package com.rakovets.course.javabasics.practice.operators;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class Task03Test extends StandardOutputTest {
    @Test
    void test1() {
        Task03.main(new String[]{"1501", "7"});
        assertEquals("2026.0", getStandardOutputContent(), "quoter root 3");
    }

    @Test
    void test2() {
        Task03.main(new String[]{"0", "100"});
        assertEquals("0.0", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task03.main(new String[]{"10000", "0"});
        assertEquals("10000.0", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task03.main(new String[]{"100", "100"});
        assertEquals("600.0", getStandardOutputContent());
    }
}