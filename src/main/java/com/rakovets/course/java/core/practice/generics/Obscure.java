package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T value;

    public Obscure(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Boolean isPresent() {
        return this.getValue() != null;
    }

    public Boolean isEmpty() {
        return this.getValue() == null;
    }

    public T orElse(T id) {
       return this.isPresent() ? this.getValue() : id;
    }

    public T orElseThrow(Exception e) throws Exception {
        if (this.isPresent()) {
            return this.getValue();
        } else {
            throw e;
        }
    }

    public static <T> Obscure<T> of(T id) {
        return new Obscure<>(id);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
