package com.rakovets.course.java.core.practice.exception_handling;

import com.rakovets.course.java.core.practice.exception_handling.tasks.Tasks;

public class DemoTask06 {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        int numberMistake = 22;
        try {
            tasks.catchTreeException(numberMistake);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException ex) {
            System.out.println("Array handling error");
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
