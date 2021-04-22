package com.rakovets.course.java.core.example.jsf_set;

import com.rakovets.course.java.core.example.jsf_set.model.Dog;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample2WithCustomObject {
    public static void main(String[] args) {
        Set<Dog> dogs = new LinkedHashSet<>();
        dogs.add(new Dog("Rex"));
        dogs.add(new Dog("John"));
        dogs.add(new Dog("Show"));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}

