package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task01Test {
    @Test
    void getStringLength() {
        Task01 task01 = new Task01();
        String firstString = null;

        Executable actualExecutable = () -> task01.getStringLength(firstString);

        Assertions.assertThrows(NullPointerException.class, actualExecutable);
    }
}
