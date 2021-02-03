package com.rakovets.course.java.core.practice.generic_types;

public class Obscure <T> {
    private final T object;
    private final T defaultObject = null;

    public Obscure(T object) {
        this.object = object;
    }

    public boolean isPresent() {
        return object != null;
    }

    public boolean isEmpty() {
        return object == null;
    }

    public T orElse() {
        if (isPresent()) {
            return this.getObject();
        }
        return this.getDefaultObject();
    }

    public T orElseThrow() throws NullPointerException {
        if (isPresent()) {
            return this.getObject();
        }
        throw new NullPointerException("No object");
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

    public T getDefaultObject() {
        return defaultObject;
    }
}
