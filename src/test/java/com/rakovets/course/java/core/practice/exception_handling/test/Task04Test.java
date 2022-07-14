package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.exception.IncorrectValuesWhenWorkingWithAnArray;
import com.rakovets.course.java.core.practice.exception_handling.tasks.Task04;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task04Test {
    @Test
    void getIndexArray() {
        Task04 task04 = new Task04();
        int index = -4;
        int[] array = {10, 11, 12, 13, 14, 15};

        Executable actualExecutable = () -> task04.getIndexArray(index, array);

        Assertions.assertThrows(IncorrectValuesWhenWorkingWithAnArray.class, actualExecutable);
    }
}
