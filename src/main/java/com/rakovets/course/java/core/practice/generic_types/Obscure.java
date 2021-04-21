package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T objectT;

    public Obscure(T obT) {
        this.objectT = obT;
    }

    public T getObjectT() {
        return objectT;
    }

    public <T> boolean isPresent() {
        return this.objectT != null;
    }

    public <T> boolean isEmpty() {
        return this.objectT == null;
    }

    public T orElse(T defaultObj) {
        if (isPresent()) {
            return this.objectT;
        } else {
            return defaultObj;
        }
    }

    public <T> Object orElseThrow(Exception exception) throws Exception {
        if (!isEmpty() && isPresent()) {
            return this.objectT;
        } else throw new Exception(exception);
    }

    public static <T> Obscure<T> of(T objectT) {
        return new Obscure<>(objectT);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }


}
