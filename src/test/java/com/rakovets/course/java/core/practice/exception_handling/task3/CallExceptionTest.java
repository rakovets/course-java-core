package com.rakovets.course.java.core.practice.exception_handling.task3;

import com.rakovets.course.java.core.practice.exception_handling.task3.exeptions.ExceptionClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class CallExceptionTest {
    CallException callException = new CallException();

    @DisplayName("Test of ExceptionClassException, throws Exception")
    @Test
    void callExceptionTest() {
        Executable executable = () -> callException.isAgeValid(10);

        Assertions.assertThrows(ExceptionClass.class, executable);
    }
}
