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

    public T orElse (T value) {
        return field != null ? field : value;
    }

    public T orElseThrow(T object) throws Exception {
        if (field != null) {
            return field;
        } else {
            throw new NullPointerException("This is NullPointer");
        }
    }

    public static <S> Obscure <S> of(S object) {
        return new Obscure<>(object);
    }

    public static <S> Obscure <S> empty() {
        return new Obscure<>(null);
    }

    @Override
    public String toString() {
        return field + "";
    }
}
