package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Tasks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class TasksTests {
    Tasks tasks;

    @BeforeEach
    public void init() {
        tasks = new Tasks();
    }
    @Test
    public void causeNullPointerExceptionTest1() {
        Executable executable = () -> tasks.causeNullPointerException();

        Assertions.assertThrows(NullPointerException.class, executable);
    }



}
