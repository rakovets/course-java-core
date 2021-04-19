package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task4Test {

    @Test
    void getNumber() {
        Task4 task4 = new Task4();
        task4.setNumber(-50);
        Executable actualExecutable = () -> task4.getNumber();
        Assertions.assertThrows(NegativeNumberException.class, actualExecutable);
    }
}
