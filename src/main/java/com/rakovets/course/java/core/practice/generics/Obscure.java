package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T id;

    public Obscure(T id) {
        this.id = id;
    }

    public Boolean isPresent() {
        return id != null;
    }

    public Boolean isEmpty() {
        return id == null;
    }

    public T orElse(T t) {
        return isPresent() ? id : t;
    }

    public T orElseThrow(Exception e) throws Exception {
        if (isPresent()) {
            return id;
        } else {
            throw e;
        }
    }

    public static <T> T of(Object obj) {
        return (T) obj;
    }

    public static <T> T empty() {
        T t = null;
        return t;
    }

    public T get() {
        return id;
    }
}
