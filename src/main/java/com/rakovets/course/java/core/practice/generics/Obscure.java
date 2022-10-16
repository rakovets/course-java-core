package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T object;

    public Obscure() {
    }

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
        return isPresent() ? object : defaultObject;
    }

    public T orElseThrow(Exception ex) throws Exception {
        if (isPresent()) {
            return object;
        } else {
            throw ex;
        }
    }

    public static <T> Obscure<T> of(T obj) {
        return new Obscure<T>(obj);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<T>(null);
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }
}
