package com.rakovets.course.java.core.practice.exception_handling;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class Task_5Test {

    @Test
    void checkNumber() {
        Executable actualExecutable = () -> Task_5.checkNumber(15);
        NumberCountException actualException = Assertions.assertThrows(NumberCountException.class, actualExecutable);
        Assertions.assertEquals("Number less then x", actualException.getMessage());
        Assertions.assertEquals("try again", actualException.getMessageDebug());
    }
}
