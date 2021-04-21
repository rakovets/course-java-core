package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T field;

    public Obscure(T field) {
        this.field = field;
    }

    public Obscure() {}

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

    public T orElseThrow() throws NullPointerException{
        if (isPresent()) {
            return field;
        } else {
            throw new NullPointerException("This is null field");
        }
    }

    public static <S> Obscure<S> of(S field) {
        return new Obscure<>(field);
    }

    public static <S> Obscure<S> empty() {
        return new Obscure<>();
    }
}
