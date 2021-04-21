package com.rakovets.course.java.core.practice.generic_types;

public class Obscure <T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public boolean isPresent() {
        return this.object != null;
    }

    public boolean isEmpty() {
        return this.object == null;
    }

    public T orElse(T defaultObject) {
        if (isPresent()) {
            return this.getObject();
        }
        return defaultObject;
    }

    public T orElseThrow(Exception e) throws Exception{
        if (isEmpty()) {
            throw e;
        }
        return this.getObject();
    }

    public static <T> Obscure<T> of (T object) {
        return new Obscure<>(object);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
