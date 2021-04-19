package com.rakovets.course.java.core.practice.exception_handling.task_01_Test;


import com.rakovets.course.java.core.practice.exception_handling.task_01.Task01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task01Test {
    @Test
    void throwSomeException() {
        Executable actualExecuted = () -> Task01.throwSomeException();
        Assertions.assertThrows(NullPointerException.class, actualExecuted);
    }
}
