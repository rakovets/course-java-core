package com.rakovets.course.java.core.practice.generics;

public class Obscure <T> {
    private T object;

    public Obscure (T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public boolean isPresent() {
        return this.object != null;
    }

    public boolean isEmpty() {
        return this.object == null;
    }

    public T orElse(T defaultObject) {
        if(isPresent()) {
            defaultObject = this.object;
        }
        return defaultObject;
    }

    public T orElseThrow(Exception e) throws Exception {
        if(isPresent()) {
            return object;
        } else {
            throw e;
        }
    }

    public static <T> Obscure <T> of(T object) {
        return new Obscure<>(object);
    }

    public static <T> Obscure <T> empty() {
        return new  Obscure<>(null);
    }
}
