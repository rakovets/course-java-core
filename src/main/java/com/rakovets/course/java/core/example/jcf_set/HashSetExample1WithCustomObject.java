package com.rakovets.course.java.core.example.jcf_set;

import com.rakovets.course.java.core.example.jcf_set.model.Dog;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1WithCustomObject {
    public static void main(String[] args) {
        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog("Rex"));
        dogs.add(new Dog("John"));
        dogs.add(new Dog("Show"));

        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}

