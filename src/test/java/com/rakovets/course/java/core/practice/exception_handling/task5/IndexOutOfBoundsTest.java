package com.rakovets.course.java.core.practice.exception_handling.task5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class IndexOutOfBoundsTest {
    IndexOutOfBounds indexOutOfBounds = new IndexOutOfBounds();

    @DisplayName("Test of IndexOutOfBoundsException, throws Exception")
    @Test
    void indexOutOfBoundsTest() {
        Executable executable = () -> indexOutOfBounds.exception();

        Assertions.assertThrows(IndexOutOfBoundsException.class, executable);
    }
}
