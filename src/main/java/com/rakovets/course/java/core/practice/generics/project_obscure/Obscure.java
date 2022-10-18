package com.rakovets.course.java.core.practice.generics.project_obscure;


public class Obscure <T> {
    private final T item;

    public Obscure(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public boolean isPresent() {
        return getItem() != null;
    }

    public boolean isEmpty() {
        return getItem() == null;
    }

    public T orElse(T item) {
        return this.isPresent() ? getItem() : item;
    }

    public T orElseThrow(MyException e) throws MyException {
        if (isPresent()) {
            return getItem();
        } else {
            throw e;
        }
    }

    public static <T>Obscure<T> of(T ob) {
        return new Obscure<>(ob);
    }

    public static <T>Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
