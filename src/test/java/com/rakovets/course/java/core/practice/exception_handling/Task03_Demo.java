package com.rakovets.course.java.core.practice.exception_handling;

public class Task03_Demo {
    public static void main(String[] args) {

        Task03 dog = new Task03("Мухтар");
        dog.putCollar();
        dog.putLeash();

        try {
           dog.walk();
        } catch (DogIsNotReadyException e) {
            System.out.println(e.getMessage());
        }
    }
}
