package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Math_ProjectTest {

    @Test
    void maximum() {
        assertEquals(300, Math_Project.maximum(10, 300, 1));
    }

    @Test
    void minimum() {
        assertEquals(1, Math_Project.minimum(10, 300, 1, 5, 1000));
    }

    @Test
    void averageArray() {
        assertEquals(2.5, Math_Project.averageValue(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    void maximumArray() {
        assertEquals(20, Math_Project.maximumValue(Arrays.asList(1, 10, 3, 20)));
    }

    @Test
    void minimumArray() {
        assertEquals(1, Math_Project.minimumValue(Arrays.asList(1, 10, 3, 20)));
    }

    @Test
    void sortArray() {
        assertEquals(Arrays.asList(1, 3, 10, 20), Math_Project.sortArray(Arrays.asList(1, 10, 3, 20)));
    }

    @Test
    void binarySearch() {
        assertEquals(2, Math_Project.binarySearch(Arrays.asList(15, 0, 4, 1, 11), 4, 0, 4));
    }
}
