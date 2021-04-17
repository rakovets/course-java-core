package com.rakovets.course.java.core.practice.generic_types;

import com.rakovets.course.java.core.exception.MyException;

public class Obscure<T> {
    private T value;

    public Obscure(T value) {
        this.value = value;
    }

    public Obscure() {

    }

    public boolean isPresent() {
        return value != null;
    }

    public boolean isEmpty() {
        if (isPresent()) {
            return value.toString().isEmpty();
        } else {
            return false;
        }
    }

    public T orElse(T object) {
        return isPresent() ? this.value : object;
    }

    public T orElseThrow(T object) throws MyException {
        if (isPresent()) {
            return object;
        } else {
            throw new MyException();
        }
    }

    public static <S> Obscure<S> of(S value) {
        return new Obscure<>(value);
    }

    public static <S> Obscure<S> empty() {
        return new Obscure<>();
    }

    public T getObject() {
        return value;
    }
}
