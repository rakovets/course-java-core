package com.rakovets.course.java.core.practice.generic_types.project_obscure;

public class Obscure <T> {
    private final T obj;

    public Obscure(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }

    public boolean isPresent() {
        return this.obj != null;
    }

    public boolean isEmpty() {
        return this.obj == null;
    }

    public T orElse(T defaultObj) {
        if (isPresent()) {
            return this.obj;
        } else {
            return defaultObj;
        }
    }

    public T orElseThrow(Exception exception) throws Exception {
        if (isPresent()) {
            return this.obj;
        } else {
            throw exception;
        }
    }

    public static <T> Obscure<T> of(T obj) {
        return new Obscure<>(obj);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }

    @Override
    public String toString() {
        return "Obscure{" +
                "obj=" + obj +
                '}';
    }
}
