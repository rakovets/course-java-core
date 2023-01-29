package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.CustomRuntimeException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsNotValidException;
import com.rakovets.course.java.core.practice.exception_handling.exceptions.NumberIsValidException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.ExceptionSimulations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ExceptionSimulationsTest {
    ExceptionSimulations tasks;

    @BeforeEach
    public void instanceTasks() {
        tasks = new ExceptionSimulations();
    }

    @Test
    public void callNullPointerExceptionTest() {
        Executable executable = () -> tasks.callNullPointerException();

        Assertions.assertThrows(NullPointerException.class, executable);
    }

    @Test
    public void callArrayIndexOutOfBoundsExceptionTest() {
        Executable executable = () -> tasks.callArrayIndexOutOfBoundsException();

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, executable);
    }

    @Test
    public void callCustomExceptionTest() {
        Executable executable = () -> tasks.callCustomException();

        Assertions.assertThrows(CustomException.class, executable);
        System.out.println("stack trace");
    }

    @Test
    public void callCustomRuntimeExceptionTest() {
        Executable executable = () -> tasks.callCustomRuntimeException();

        Assertions.assertThrows(CustomRuntimeException.class, executable);
    }

    @Test
    public void callIllegalAccessExceptionTest() {
        Executable executable = () -> tasks.callIllegalAccessException();

        Assertions.assertThrows(IllegalAccessException.class, executable);
    }

    @Test
    public void callThreeExceptionsTest() {
        Executable executableLessZero = () -> tasks.callThreeExceptions(-1);
        Executable executableIsZero = () -> tasks.callThreeExceptions(-1);
        Executable executableMoreZero = () -> tasks.callThreeExceptions(1);

        Assertions.assertThrows(NumberIsNotValidException.class, executableLessZero);
        Assertions.assertThrows(NumberIsNotValidException.class, executableIsZero);
        Assertions.assertThrows(NumberIsValidException.class, executableMoreZero);
    }
}
