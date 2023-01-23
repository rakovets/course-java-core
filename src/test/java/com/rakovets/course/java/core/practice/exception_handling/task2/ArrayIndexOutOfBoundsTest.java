package com.rakovets.course.java.core.practice.exception_handling.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ArrayIndexOutOfBoundsTest {
    private ArrayIndexOutOfBounds arrayIndexOutOfBounds;

    @BeforeEach
    void init() {
        arrayIndexOutOfBounds = new ArrayIndexOutOfBounds();
    }

    @DisplayName("")
    @Test
    void indexOutOfTest() {
        Executable executable = () -> arrayIndexOutOfBounds.indexOutOf();

        Assertions.assertThrows(IndexOutOfBoundsException.class, executable);
    }
}
