package com.rakovets.course.java.core.practice.generics.project_obscure;

import java.util.logging.Logger;

public class Obscure <T> {
    private T item;

    public Obscure(T item) {
        this.item = item;
    }

    public boolean isPresent() {
        return getItem() != null;
    }

    public boolean isEmpty() {
        return getItem() == null;
    }

    public T orElse(T defaultIem) {
        return this.isPresent() ? getItem() : defaultIem;
    }

    public T orElseThrow(MyException e) throws MyException {
        if (isPresent()) {
            return getItem();
        } else {
            throw e;
        }
    }

    public static <T>Obscure<T> of(T anotherItem) {
        return new Obscure<>(anotherItem);
    }

    public static <T>Obscure<T> empty() {
        return new Obscure<>(null);
    }

    public static final Logger logger = Logger.getLogger(Obscure.class.getName());

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
