package com.rakovets.course.java.core.practice.exception_handling.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CallNullPointerExceptionTest {
    CallNullPointerException callNullPointerException = new CallNullPointerException();

    @DisplayName("Test of indexOutOf, throws NullPointerException")
    @Test
    void indexOutOfTest() {
        Executable executable = () -> callNullPointerException.stringConcat();

        Assertions.assertThrows(NullPointerException.class, executable);
    }
}
