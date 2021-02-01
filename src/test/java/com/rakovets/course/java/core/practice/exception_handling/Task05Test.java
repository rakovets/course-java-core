package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.Exceptions.AgeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class Task05Test {

    @Test
    void checkAge() {
        Executable actualExecutable = () -> Task05.checkAge(15);
        AgeException actualException = Assertions.assertThrows(AgeException.class, actualExecutable);
        Assertions.assertEquals("You are a minor", actualException.getMessage());
        Assertions.assertEquals("You don't have an access", actualException.getDebugMessage());
    }
}
