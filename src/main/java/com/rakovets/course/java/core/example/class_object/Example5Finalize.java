package com.rakovets.course.java.core.example.class_object;

import com.rakovets.course.java.core.example.class_object.model.Person;

public class Example5Finalize {
    public static void main(String[] args) throws InterruptedException {
        Person person1 = new Person("Dmitry", "Rakovets");
        Person person2 = new Person("James", "Gosling");

        // After
        person1 = null;
        person2 = null;

        // Call GC: way 1
        System.gc();
        // Call GC: way 2
        Runtime.getRuntime().gc();
        // Increases the chance of garbage collection
        Thread.sleep(5_000);

        System.out.println("End program");
    }
}
