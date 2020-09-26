package com.rakovets.course.javabasics.example.lambda;

@FunctionalInterface
public interface Operation {
    int operate(int n1, int n2);
}