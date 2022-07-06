package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
