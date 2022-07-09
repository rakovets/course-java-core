package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task04;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task04Test {
    @Test
    void getIndexArray() {
        int index = 1;
        int[] array = {10, 11, 12, 13, 14, 15};

        Executable actualExecutable = () -> Task04.getIndexArray(index, array);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
