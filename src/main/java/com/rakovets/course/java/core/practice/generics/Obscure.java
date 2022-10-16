package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T id;

    public Obscure(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public Boolean isPresent() {
        return this.getId() != null;
    }

    public Boolean isEmpty() {
        return this.getId() == null;
    }

    public T orElse(T id) {
       return this.isPresent() ? this.getId() : id;
    }

    public T orElseThrow(Exception e) throws Exception {
        if (this.isPresent()) {
            return this.getId();
        } else {
            throw e;
        }
    }

    public static <T> Obscure<T> of(T id) {
        return new Obscure<>(id);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
