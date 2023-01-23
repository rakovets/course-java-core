package com.rakovets.course.java.core.practice.exception_handling.task3;

import com.rakovets.course.java.core.practice.exception_handling.task3.exeptions.ExceptionClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CallExceptionTest {
    private CallException callException;

    @BeforeEach
    void init() {
        callException = new CallException();
    }

    @Test
    void callExceptionTest() {
        Executable executable = () -> callException.calLException(10);

        Assertions.assertThrows(ExceptionClass.class, executable);
    }
}
