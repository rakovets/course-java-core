package com.rakovets.course.java.core.practice.exception_handling.Task05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class AgeTest {

    @Test
    void checkAge() {
        Age message = new Age(15);
        Executable actualExecutable = message::checkAge;
        Age.AgeException actualException = Assertions.assertThrows(Age.AgeException.class, actualExecutable);
        Assertions.assertEquals("You are a minor", actualException.getMessage());
        Assertions.assertEquals("You don't have an access", actualException.getDebugMessage());
    }
}
