package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task02Test {
    @Test
    void getIndexFromArray() {
        int index = 4;
        int[] array = {1, 2, 4};

        Executable actualExecutable = () -> Task02.getIndexArray(index, array);

        Assertions.assertThrows(Exception.class, actualExecutable);
    }
}
