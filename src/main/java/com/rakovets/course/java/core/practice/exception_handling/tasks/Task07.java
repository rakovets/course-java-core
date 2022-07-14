package com.rakovets.course.java.core.practice.exception_handling.tasks;

public class Task07 {
    /**
     * Division of two numbers.
     *
     * @param firstNumber  dividend.
     * @param secondNumber divisor.
     * @return quotient of two numbers.
     * @throws Exception Outputs text when the dividend is zero.
     *                   That the operation is pointless and the answer will not change.
     */
    public int division(int firstNumber, int secondNumber) throws Exception {
        final int EXCEPTION_NUMBER = 0;

        if (secondNumber == EXCEPTION_NUMBER) {
            throw new ArithmeticException("Divide by zero is not possible.");
        }
        if (firstNumber == EXCEPTION_NUMBER) {
            throw new Exception("Dividing will not change the result.");
        }
        return firstNumber / secondNumber;
    }
}
