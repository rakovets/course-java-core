package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T get() {
        return this.object;
    }

    public boolean isPresent() {
        return get() != null;
    }

    public boolean isEmpty() {
        return get() == null;
    }

    public T orElse(T defaultObject) {
        return this.isPresent() ? this.get() : defaultObject;
    }

    public T orElseThrow(Exception exception) throws Exception {
        if (this.isPresent()) {
            return this.get();
        }
        else {
            throw exception;
        }
    }

    public static <T> Obscure<T> of(T defaultObject) {
        return new Obscure<>(defaultObject);
    }

    public static <T> Obscure<T> empty() {
    return new Obscure<>(null);
    }
}
