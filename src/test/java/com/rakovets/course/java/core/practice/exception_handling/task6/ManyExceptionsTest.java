package com.rakovets.course.java.core.practice.exception_handling.task6;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

public class ManyExceptionsTest {
    @DisplayName("Test trowExceptionTest, throws NullPointerException")
    @Test
    void trowExceptionTest1() {
        ManyExceptions manyExceptions = new ManyExceptions(1);

        Executable executable = manyExceptions::trowException;

        Assertions.assertThrows(NullPointerException.class, executable);
    }

    @DisplayName("Test trowExceptionTest, throws RuntimeException")
    @Test
    void trowExceptionTest2() {
        ManyExceptions manyExceptions = new ManyExceptions(2);

        Executable executable = manyExceptions::trowException;

        Assertions.assertThrows(RuntimeException.class, executable);
    }

    @DisplayName("Test trowExceptionTest, throws IndexOutOfBoundsException")
    @Test
    void trowExceptionTest3() {
        ManyExceptions manyExceptions = new ManyExceptions(3);

        Executable executable = manyExceptions::trowException;

        Assertions.assertThrows(IndexOutOfBoundsException.class, executable);
    }
}
