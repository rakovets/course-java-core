package com.rakovets.course.java.core.practice.exception_handling;

public class Task06Demo {
    public static void main(String[] args) {
        Task06 task06 = new Task06();
        try {
            task06.randomException(null, new int[] {1, 2}, 0);
        } catch (NullPointerException e) {
            e.getMessage();
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        } catch (ArithmeticException e) {
            e.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
