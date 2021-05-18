package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T parametriseObject;

    public Obscure(T parametriseObject) {
        this.parametriseObject = parametriseObject;
    }

    public T get() {
        return parametriseObject;
    }

    public boolean isPresent() {
        return parametriseObject != null;
    }

    public boolean isEmpty() {
        return parametriseObject == null;
    }

    public T orElse(T currentParametriseObject) {
        if (parametriseObject != null) {
            return parametriseObject;
        } else {
            return currentParametriseObject;
        }
    }

    public T orElseThrow(Exception exception) throws Exception {
        if(isPresent()) {
            return parametriseObject;
        } else {
            throw exception;
        }
    }

    public static <T> Obscure<T> of(T obscure) {
        return new Obscure<>(obscure);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
