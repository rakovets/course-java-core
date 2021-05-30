package com.rakovets.course.java.core.practice.generic_types.obscure;

public class Obscure<T> {
    private T value;

    public Obscure(T parameterObscure) {
        this.value = parameterObscure;
    }

    public T getValue() {
        return value;
    }

    public boolean isPresent() {
        return value != null;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public T orElse(T currentParameterObscure) {
       return isPresent() ? value : currentParameterObscure;
    }

    public T orElseThrow(Exception exception) throws Exception {
            if (isPresent()) {
                return value;
            } else {
                throw exception;
            }
    }
    public static <S> Obscure<S> of(S obj) {
        return new Obscure<>(obj);
    }

    public static <S> Obscure<S> empty() {
        return new Obscure<>(null);
    }
}
