package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    final private T obscure;

    public Obscure(T obscure) {
        this.obscure = obscure;
    }

    public T getObscure() {
        return obscure;
    }

    public boolean isPresent() {
        return this.obscure != null;
    }

    public boolean isEmpty() {
        return this.obscure == null;
    }

    public T orElse(T defoltObscure) {
        return isPresent() ? this.obscure : defoltObscure;
    }

    public T orElseThrow(Exception exception) throws Exception {
        if (isPresent()) {
            return this.getObscure();
        } else {
            throw exception;
        }
    }

    public static <A> Obscure<A> of(A object) {
        return new Obscure<>(object);
    }

    public static <A> Obscure<A> empty() {
        return new Obscure<>(null);
    }
}
