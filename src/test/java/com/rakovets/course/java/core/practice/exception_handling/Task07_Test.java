package com.rakovets.course.java.core.practice.exception_handling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task07_Test {

    @Test
    void random50PercentException() {
        Task07 task = new Task07();
        Executable actualExecutable = () -> task.random50PercentException(1);
        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
