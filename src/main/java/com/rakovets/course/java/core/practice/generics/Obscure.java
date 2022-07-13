package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
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
            result = this.object;
        } else result = object;
        return result;
    }

    public T orElseThrow(Exception ex) throws Exception{
        if (isEmpty()) {
            throw ex;
        }
        return this.object;
    }

    public static <T> Obscure of(T object) {
        return new Obscure(object);
    }

    public static Obscure empty() {
        return new Obscure(null);
    }

    public T getObject() {
        return this.object;
    }
}
