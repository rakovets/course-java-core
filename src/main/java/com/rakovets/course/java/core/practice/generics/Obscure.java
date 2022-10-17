package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T object;

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

    public T orElseThrow(Exception e) throws Exception {
        if (isPresent()) {
            return object;
        } else {
            throw e;
        }
    }

    public static <T> Obscure<T> of(T object) {
        return new Obscure<T>(object);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<T>(null);
    }
}
