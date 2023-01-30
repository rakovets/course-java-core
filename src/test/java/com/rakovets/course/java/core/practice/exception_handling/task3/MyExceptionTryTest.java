package com.rakovets.course.java.core.practice.exception_handling.task3;

import com.rakovets.course.java.core.practice.exception_handling.task3.exeptions.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class MyExceptionTryTest {
    MyExceptionTry myExceptionTry = new MyExceptionTry();

    @DisplayName("Test of ExceptionClassException, throws Exception")
    @Test
    void callExceptionTest() {
        Executable executable = () -> myExceptionTry.isAgeValid(10);

        Assertions.assertThrows(MyException.class, executable);
    }
}
