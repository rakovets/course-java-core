package com.rakovets.course.java.core.practice.generic_types;

public class Obscure <A> {
    private final A object;

    public Obscure(A object) {
        this.object = object;
    }

    public boolean isPresent() {
        return this.object != null;
    }

    public boolean isEmpty() {
        return this.object == null;
    }

    public A orElse(A defaultObject) {
        if (isPresent()) {
            return this.getObject();
        }
        return defaultObject;
    }

    public A orElseThrow(Exception ex) throws Exception {
        if (isEmpty()) {
            throw ex;
        }
        return this.getObject();
    }

    public static <A> Obscure<A> of(A object) {
        return new Obscure<>(object);
    }

    public static <A> Obscure<A> empty() {
        return new Obscure<>(null);
    }

    public A getObject() {
        return object;
    }
}
