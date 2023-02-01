package com.rakovets.course.java.core.practice.generics.obscure;

public class Obscure<T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T get() {
        return this.object;
    }

    public Boolean isPresent() {
        return object != null;
    }

    public Boolean isEmpty() {
        return object == null;
    }

    public T orElse(T defaultObject) {
        return isPresent() ? this.object : defaultObject;
    }

    public T orElseThrow(Exception exception) throws Exception {
        if (this.isPresent()) {
            return this.object;
        } else {
            throw exception;
        }
    }

    public static <T> Obscure<T> of(T object) {
        return new Obscure<>(object);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
