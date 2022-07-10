package com.rakovets.course.java.core.practice.generics;

import java.util.Objects;

public class Obscure<T>{
    private T field;

    public Obscure(T field) {
        this.field = field;
    }

    public Obscure<T> get() {
        return this;
    }

    public boolean isPresent() {
        return this.field != null;
    }

    public boolean isEmpty() {
        return this.field == null;
    }

    public T orElse(T field) {
        if(isPresent()) {
            field = this.field;
        }
        return field;
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

    public static <T> Obscure<T> empty(T field) {
        return new Obscure<>(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obscure<?> obscure = (Obscure<?>) o;
        return Objects.equals(field, obscure.field);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field);
    }
}
