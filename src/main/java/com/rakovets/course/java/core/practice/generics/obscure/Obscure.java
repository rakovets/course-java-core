package com.rakovets.course.java.core.practice.generics.obscure;

public class Obscure<T> {
    private final T object;

    public Obscure(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public boolean isPresent() {
        return object != null;
    }

    public boolean isEmpty() {
        return object.toString().length() == 0;
    }

    public Object orElse(Obscure<?> object) {
        return this.isPresent() ? this.get() : object.get();
    }

    public T orElseThrow(Exception exception) throws Exception {
        T result;

        if (isPresent()) {
            result = object;
        } else {
            throw exception;
        }

        return result;
    }

    public static <T> Obscure<T> of(T object) {
        return new Obscure<>(object);
    }

    public static Obscure<?> empty() {
        return new Obscure<>(new Object());
    }
}
