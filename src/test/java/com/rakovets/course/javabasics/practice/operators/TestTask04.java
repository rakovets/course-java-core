package com.rakovets.course.javabasics.practice.operators;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class TestTask04 extends StandardOutputTest {
    @Test
    void test1() {
        Task04.main(new String[]{"3"});
        assertEquals("1.7320508075688772", getStandardOutputContent(), "quoter root 3");
    }

    @Test
    void test2() {
        Task04.main(new String[]{"9"});
        assertEquals("3.0", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task04.main(new String[]{"256"});
        assertEquals("16.0", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task04.main(new String[]{"-3"});
        assertEquals("NaN", getStandardOutputContent());
    }
}