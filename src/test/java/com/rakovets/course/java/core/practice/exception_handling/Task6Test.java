package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task6Test {

    @Test
    void randomException() {
        Task6 task6 = new Task6();
        Executable actualExecutable = () -> task6.randomException(0.1);
        Assertions.assertThrows(ArithmeticException.class, actualExecutable);
        Executable actualExecutable1 = () -> task6.randomException(0.4);
        Assertions.assertThrows(NullPointerException.class, actualExecutable1);
        Executable actualExecutable2 = () -> task6.randomException(0.8);
        Assertions.assertThrows(NumberFormatException.class, actualExecutable2);
    }
}
