package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T obj = null;
    private T defaultObj = null;

    public T getDefaultObj() {
        return defaultObj;
    }

    public Obscure(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public boolean isPresent() {
        return obj != null;
    }

    public boolean isEmpty() {
        return obj == null;
    }

    public T orElse() {
        if(isPresent()) {
            return this.getObj();
        }
        return this.defaultObj;
    }

    public T orElseThrow() throws NullPointerException {
        if(isPresent()) {
            return this.getObj();
        }
        throw new NullPointerException("Object is not exist");
    }

    public static <T> Obscure<T> of(T obj) {
        return new Obscure<>(obj);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
