package com.rakovets.course.javabasics.practice.math;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task06Test extends StandardOutputTest {
    @Test
    void test0() {
        Task06.main(new String[]{"-273.15"});
        assertEquals("Celsius -273.15° - Kelvin 0.0° - Fahrenheit -459.66999999999996°", getStandardOutputContent());
    }

    @Test
    void test1() {
        Task06.main(new String[]{"-17.78"});
        assertEquals("Celsius -17.78° - Kelvin 255.36999999999998° - Fahrenheit -0.0040000000000048885°", getStandardOutputContent());
    }

    @Test
    void test2() {
        Task06.main(new String[]{"0"});
        assertEquals("Celsius 0.0° - Kelvin 273.15° - Fahrenheit 32.0°", getStandardOutputContent());
    }

    @Test
    void test3() {
        Task06.main(new String[]{"36.8"});
        assertEquals("Celsius 36.8° - Kelvin 309.95° - Fahrenheit 98.24°", getStandardOutputContent());
    }

    @Test
    void test4() {
        Task06.main(new String[]{"5526.0"});
        assertEquals("Celsius 5526.0° - Kelvin 5799.15° - Fahrenheit 9978.8°", getStandardOutputContent());
    }
}