package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task05;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task05Test {
    @Test
    void getIndexArray() {
        int index = 5;
        int number = -4;

        Executable actualExecutable = () -> Task05.getIndexArray(index, number);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
