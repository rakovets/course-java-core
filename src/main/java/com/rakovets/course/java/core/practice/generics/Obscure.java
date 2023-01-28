package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T object;

    Obscure(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public boolean isPresent() {
        return object != null;
    }

    public boolean isEmpty() {
        return  object.toString().isEmpty();
    }

    public T orElse(T object) {
        return isPresent() ? this.object : object;
    }

    public T orElseThrow(Exception exception) throws Exception {
        T result;
        if (isPresent()) {
            result = object;
        } else {
            throw exception;
        }
        return result;
    }

    public static <T> Obscure<T> of(T object) {
        return new Obscure<>(object);
    }

    public static <T> Obscure<T> empty(T object) {
        return new Obscure<>(null);
    }
}
