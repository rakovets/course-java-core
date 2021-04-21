package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T element;

    public Obscure(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public boolean isPresent() {
        return element != null;
    }

    public boolean isEmpty() {
        return element == null;
    }

    public T orElse(T defaultElement) {
        if (element == null) {
            return defaultElement;
        }
        return element;
    }

    public T orElseThrow() {
        if (element != null) {
            return element;
        } else {
            throw new NullPointerException("This is NullPointException!");
        }
    }

    public static <S> Obscure<S> of(S object) {
        return new Obscure<S>(object);
    }

    public static <S> Obscure<S> empty() {
        return new Obscure<S>(null);
    }
}
