package com.rakovets.course.java.core.practice.exception_handling;

public class Task07 {
    public int divisionTwoNumbers(int firstNumber, int secondNumber) throws Exception {
        if (secondNumber == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        if (firstNumber == 0) {
            throw new Exception("Ответ всегда равен 0");
        }
        return firstNumber / secondNumber;
    }
}
