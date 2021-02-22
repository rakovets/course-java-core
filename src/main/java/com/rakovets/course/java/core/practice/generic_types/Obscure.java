package com.rakovets.course.java.core.practice.generic_types;

public class Obscure <T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
    }

    public boolean isPresent() {
        return object != null;
    }

    public boolean isEmpty() {
        return object == null;
    }

    public T orElse(T defaultObject) {
        if (isPresent()) {
            return this.getObject();
        }
        return defaultObject;
    }

    public T orElseThrow(Exception ex) throws Exception {
        if (isEmpty()) {
            throw ex;
        }
        return this.getObject();
    }

    public static <T> Obscure<T> of(T object) {
        return new Obscure<>(object);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }

    public T getObject() {
        return object;
    }
}
