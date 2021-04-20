package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.FileNotFoundException;

public class Task7Test {

    @Test
    void throwExceptionFiftyPercent() {
        Task7 task7 = new Task7();
        Executable actualExecutable = () -> task7.throwExceptionFiftyPercent(0.4);
        Assertions.assertThrows(FileNotFoundException.class, actualExecutable);
    }
}
