package com.rakovets.course.java.core.practice.generics;

public class Obscure <T> {
    private T object;

    public Obscure(T object) {
        this.object = object;
    }

    public boolean isPresent() {
        return object != null;
    }

    public boolean isEmpty() {
        return this.object == null;
    }

    public T orElse(T defaultObject) {
        if(isPresent())
        {
            defaultObject = this.object;
        }
        return defaultObject;
    }

    public T orElseThrow(Exception exception) throws Exception{
        if(isPresent()){
            return object;
        } else {
            throw exception;
        }
    }

    public static <T> Obscure of(T object) {
        return new Obscure<>(object);
    }

    public static <T> Obscure empty(T object) {
        return new Obscure(null);
    }

    public Obscure<T> get() {
        return this;
    }
}
