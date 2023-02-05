package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public boolean isPresent() {
        return object != null;
    }

    public boolean isEmpty() {
        return object == null;
    }

    public T orElse(T defaultObject) {
        return isPresent() ? object : defaultObject;
    }

    public T orElseThrow(Exception exception) throws Exception {
        if (isEmpty()) {
            throw exception;
        }
        return object;
    }

    public static <T> Obscure<T> of(T defultObject) {
        return new Obscure<>(defultObject);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
