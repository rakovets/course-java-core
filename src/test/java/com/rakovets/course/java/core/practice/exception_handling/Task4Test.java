package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Task4Test {

    @Test
    void getRotationFrequencyTest() {
        Executable actualExecutable = () -> Task4.RotationFrequency.getRotationFrequency(180, -60);
        Assertions.assertThrows(Task4.IllegalRotationValueException.class, actualExecutable);
    }
}
