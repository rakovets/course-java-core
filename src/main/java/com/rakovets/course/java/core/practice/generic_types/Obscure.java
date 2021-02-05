package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T obj = null;

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

    public T orElse(T obj) {
        if(isPresent()) {
            return this.getObj();
        }
        return obj;
    }

    public T orElseThrow(Exception ex) throws Exception {
        if(isEmpty()) {
            throw ex;
        }
        return this.getObj();
    }

    public static <T> Obscure<T> of(T obj) {
        return new Obscure<>(obj);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
