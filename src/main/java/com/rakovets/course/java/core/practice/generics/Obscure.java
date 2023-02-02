package com.rakovets.course.java.core.practice.generics;

import com.rakovets.course.java.core.practice.exception_handling.exception.MyException;

public class Obscure<T> {
    T obscure;

    public Obscure() {
    }

    public Obscure(T obscure) {
        this.obscure = obscure;
    }

    public T get() {
        return obscure;
    }

    public boolean isPresent() {
        if (this != null) {
            return true;
        } else return false;
    }

    public boolean isEmpty() {
        if (isPresent() && get() != null) {
            return false;
        } else return true;
    }

    public T orElse(T defaultObject) {
        if (!isEmpty()) {
            return get();
        } else return defaultObject;
    }

    public T orElseThrow(Exception ex) throws Exception {
        if (isPresent()) {
            return get();
        } else {
            throw new Exception("Object does not exist");
        }
    }

    public static <T> T of(T obscure) {
        return obscure;
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>();
    }
}
