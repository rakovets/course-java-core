package com.rakovets.course.javabasics.practice.operators;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class Task02Test extends StandardOutputTest {
    @Test
    void test1() {
        Task02.main(new String[]{"1", "2"});
        assertEquals("1", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task02.main(new String[]{"2", "1"});
        assertEquals("0", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task02.main(new String[]{"3", "2"});
        assertEquals("1", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task02.main(new String[]{"-3", "2"});
        assertEquals("-1", getStandardOutputContent());
    }

    @Test
    void test5() {
        Task02.main(new String[]{"-3", "-2"});
        assertEquals("-1", getStandardOutputContent());
    }

    @Test
    void test6() {
        Task02.main(new String[]{"3", "-2"});
        assertEquals("1", getStandardOutputContent());
    }
}