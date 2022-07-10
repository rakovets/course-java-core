package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T get() {
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

    public static <T> Obscure of(T object) {
        return new Obscure<>(object);
    }

    public static Obscure empty() {
        return new Obscure<>(null);
    }
}
