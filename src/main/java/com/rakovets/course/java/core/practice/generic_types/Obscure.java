package com.rakovets.course.java.core.practice.generic_types;

public class Obscure <A> {
    private final A object;
    private final A defaultObject = null;

    public Obscure(A object) {
        this.object = object;
    }

    public boolean isPresent() {
        return this.object != null;
    }

    public boolean isEmpty() {
        return this.object == null;
    }

    public A orElse() {
        if (isPresent()) {
            return this.getObject();
        }
        return this.getDefaultObject();
    }

    public A orElseThrow() throws NullPointerException {
        if (isEmpty()) {
            throw new NullPointerException("Object doesn't exist");
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

    public A getDefaultObject() {
        return defaultObject;
    }
}
