package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T item;


    public Obscure(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public boolean isPresent() {
        return item != null;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public T orElse(T defaultItem) {
        if(item != null) {
            return item;
        } else {
            return defaultItem;
        }
    }

    public T orElseThrow() throws NullPointerException {
        if(item != null) {
            return item;
        } else {
            throw new NullPointerException("'item' is empty");
        }
    }

    public static <T> Obscure<T> of(T obj) {
        return new Obscure<>(obj);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
