package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private final T field;

    public Obscure(T field) {
        this.field = field;
    }

    public T get() {
        return this.field;
    }

    public Boolean isPresent() {
        return get() != null;
    }

    public Boolean isEmpty() {
        boolean result = true;
        if (this.field.getClass().isArray()) {
            result = ((Object[]) this.field).length == 0;
        } else if (this.field instanceof String) {
            result = ((String) this.field).isEmpty();
        }
        return result;
    }

    public T orElse(T defaultObject) {
        return this.isPresent() ? this.get() : defaultObject;
    }

    public T orElseThrow(Exception ex) throws Exception {
        if (this.isPresent()) {
            return get();
        } else {
            throw ex;
        }
    }

    public static <T> Obscure<T> of(T defaultObject) {
        return new Obscure<>(defaultObject);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }
}
