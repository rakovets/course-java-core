package com.rakovets.course.java.core.practice.exception_handling.task4;

import com.rakovets.course.java.core.practice.exception_handling.task4.exceptions.CustomRuntimeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CallRuntimeExceptionTest {
    CallRuntimeException callRuntimeException;

    @BeforeEach
    void init() {
        callRuntimeException = new CallRuntimeException();
    }

    @Test
    void callRuntimeExceptionTest() {
        Executable executable = () -> callRuntimeException.isAgeValid(19);

        Assertions.assertThrows(CustomRuntimeException.class, executable);
    }
}
