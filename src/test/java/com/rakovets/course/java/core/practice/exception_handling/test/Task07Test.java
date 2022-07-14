package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task07;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task07Test {
    Task07 task07 = new Task07();

    @Test
    void divisionFirstTest() {
        int firstNumber = 7;
        int secondNumber = 0;

        Executable actualExecutable = () -> task07.division(firstNumber, secondNumber);

        Assertions.assertThrows(ArithmeticException.class, actualExecutable);
    }

    @Test
    void divisionSecondTest() {
        int firstNumber = 0;
        int secondNumber = 7;

        Executable actualExecutable = () -> task07.division(firstNumber, secondNumber);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
