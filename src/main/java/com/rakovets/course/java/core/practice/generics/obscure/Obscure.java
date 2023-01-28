package com.rakovets.course.java.core.practice.generics.obscure;

public class Obscure<T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T get() {
        return this.object;
    }

    public boolean isPresent() {
        return object != null;
    }

    public boolean isEmpty() {
        return object.toString().length() == 0;
    }

    public T orElse(T object) {
        return isPresent() ? this.object : object;
    }

    public T orElseThrow(Exception exception) throws Exception {
        if (this.isPresent()) {
            return this.object;
        } else {
            throw exception;
        }
    }

    public static <T> T of(T object) {
        return object;
    }

    public static <T> T empty() {
        T result;

        result = (T) new Obscure<>("");

        return result;
    }
}
