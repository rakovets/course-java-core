package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task01Test {
    @Test
    void getStringLength() {
        String firstString = null;

        Executable actualExecutable = () -> Task01.getStringLength(firstString);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
