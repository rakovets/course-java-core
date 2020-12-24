package com.rakovets.course.javabasics.practice.operators;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task06Test extends StandardOutputTest {
    @Test
    void test1() {
        Task06.main(new String[]{"1"});
        assertEquals("0 0:0:1", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task06.main(new String[]{"61"});
        assertEquals("0 0:1:1", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task06.main(new String[]{"3661"});
        assertEquals("0 1:1:1", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task06.main(new String[]{"86401"});
        assertEquals("1 0:0:1", getStandardOutputContent());
    }

    @Test
    void test5() {
        Task06.main(new String[]{"914701"});
        assertEquals("10 14:5:1", getStandardOutputContent());
    }
}
