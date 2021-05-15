package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T field;

    public Obscure(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    public boolean isPresent() {
        return field != null;
    }

    public boolean isEmpty() {
        return field == null;
    }

    public T orElse(T defaultField) {
        return isPresent() ? field : defaultField;
    }

    public T orElseThrow(Exception exception) throws Exception {
        if (isPresent()) {
            return field;
        } else {
            throw exception;
        }
    }

    public static <T> Obscure<T> of(T field) {
        return new Obscure<>(field);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
