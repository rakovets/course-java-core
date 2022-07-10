package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T getObject() {
        return this.object;
    }

    public boolean isPresent() {
        return getObject() != null;
    }

    public boolean isEmpty() {
        return getObject() == null;
    }

    public T orElse(T object) {
        T result;
        if (isPresent()) {
            result = getObject();
        } else result = object;
        return result;
    }

    public T orElseThrow(Exception ex) throws Exception{
        if (isEmpty()) {
            throw ex;
        }
        return getObject();
    }

    public static <T> T of(T object) {
        return object;
    }

    public static <T> T empty(T object) {
        object = null;
        return object;
    }
}
