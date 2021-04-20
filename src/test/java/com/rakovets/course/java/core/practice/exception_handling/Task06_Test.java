package com.rakovets.course.java.core.practice.exception_handling;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task06_Test {

    @Test
    void randomException() {
        Task06 task = new Task06();
        Executable actualExecutable = () -> task.randomException(1);
        Assertions.assertThrows(ArithmeticException.class, actualExecutable);
        Executable actualExecutable1 = () -> task.randomException(2);
        Assertions.assertThrows(NullPointerException.class, actualExecutable1);
        Executable actualExecutable2 = () -> task.randomException(3);
        Assertions.assertThrows(Exception.class, actualExecutable2);
    }
}
