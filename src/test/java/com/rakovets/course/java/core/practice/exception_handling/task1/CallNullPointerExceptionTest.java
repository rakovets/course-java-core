package com.rakovets.course.java.core.practice.exception_handling.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CallNullPointerExceptionTest {
    private CallNullPointerException callNullPointerException;

    @BeforeEach
    void init() {
        callNullPointerException = new CallNullPointerException();
    }

    @DisplayName("NullPointerException trows test")
    @Test
    void indexOutOfTest() {
        Executable executable = () -> callNullPointerException.stringConcat();

        Assertions.assertThrows(NullPointerException.class, executable);
    }
}
