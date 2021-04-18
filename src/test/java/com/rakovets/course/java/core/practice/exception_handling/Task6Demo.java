package com.rakovets.course.java.core.practice.exception_handling;

public class Task6Demo {
    public static void main(String[] args) {
        try {
            int result = Task6.choiceUrDestiny();
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch (NullPointerException ex){
            System.out.println("ur exeption " + ex.getMessage());
        }
    }
}
