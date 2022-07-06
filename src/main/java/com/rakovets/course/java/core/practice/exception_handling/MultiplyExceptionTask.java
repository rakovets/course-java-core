package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentNegativeException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentPositiveException;
import com.rakovets.course.java.core.practice.exception_handling.exception.ArgumentZeroException;

public class MultiplyExceptionTask {
    public void produceMultiplyExceptions(int number) throws ArgumentNegativeException, ArgumentZeroException, ArgumentPositiveException {
        if (number > 0) {
            throw new ArgumentPositiveException("It's positive number");
        } else if (number == 0) {
            throw new ArgumentZeroException("It's zero");
        } else {
            throw new ArgumentNegativeException("It's negative number");
        }
    }
}
