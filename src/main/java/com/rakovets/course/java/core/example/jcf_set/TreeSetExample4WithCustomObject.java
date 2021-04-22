package com.rakovets.course.java.core.example.jcf_set;

import com.rakovets.course.java.core.example.jcf_set.model.Dog;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample4WithCustomObject {
    public static void main(String[] args) {
        Set<Dog> dogs = new TreeSet<>();
        dogs.add(new Dog("Rex")); // Dog cannot be cast to class java.lang.Comparable
        dogs.add(new Dog("John"));
        dogs.add(new Dog("Show"));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}

