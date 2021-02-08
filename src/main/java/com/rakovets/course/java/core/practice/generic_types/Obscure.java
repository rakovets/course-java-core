package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T obj;
    private T defaultObj = null;

    public Obscure(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public boolean isPresent() {
        return getObj() != null;
    }

    public boolean isEmpty() {
        return getObj() == null;
    }

    public T orElse(T obj) {
        if (isPresent()) {
            return getObj();
        } else {
            return defaultObj;
        }
    }

    public T orElseThrow() throws NullPointerException {
        if (isPresent()) {
            return getObj();
        } else {
            throw new NullPointerException();
        }
    }

    public static <T> Obscure<T> of(T obj) {
        return new Obscure<>(obj);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
