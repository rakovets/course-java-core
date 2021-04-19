package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task3Test {

    @Test
    void setSide() {
        Task3 task3 = new Task3();
        Executable actualExecutable = () -> task3.setSide(-50);
        Assertions.assertThrows(SideException.class, actualExecutable);
    }
}
