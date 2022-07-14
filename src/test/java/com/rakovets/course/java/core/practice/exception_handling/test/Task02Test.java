package com.rakovets.course.java.core.practice.exception_handling.test;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Task02;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task02Test {
    @Test
    void getIndexFromArray() {
        Task02 task02 = new Task02();
        int index = 4;
        int[] array = {1, 2, 4};

        Executable actualExecutable = () -> task02.getIndexArray(index, array);

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, actualExecutable);
    }
}
