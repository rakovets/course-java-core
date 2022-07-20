package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.exception.IncorrectValuesWhenWorkingWithAnArrayException;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task05;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Task05Test {
    @Test
    void getIndexArray() {
        Task05 task05 = new Task05();
        int index = 5;
        int number = -4;

        Executable actualExecutable = () -> task05.getIndexArray(index, number);

        Assertions.assertThrows(IncorrectValuesWhenWorkingWithAnArrayException.class, actualExecutable);
    }
}
