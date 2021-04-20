package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class Task5Test {


    @Test
    void getDevideNumbers() {
        Task5 task5 = new Task5();
        Executable actualExecutable = () -> task5.getDevideNumbers(5, 0);
        Assertions.assertThrows(ArithmeticException.class, actualExecutable);
    }
}
