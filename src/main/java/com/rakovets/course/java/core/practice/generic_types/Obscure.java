package com.rakovets.course.java.core.practice.generic_types;

public class Obscure<T> {
    private T obT;

    public Obscure(T obT) {
        this.obT = obT;
    }

    public T getObT() {
        return this.obT;
    }

    public <T> boolean isPresent() {
        return this.obT != null;
    }

    public <T> boolean isEmpty() {
        return this.obT == null;
    }

    public T orElse(T defaultObj) {
        if (isPresent()) {
            return this.obT;
        } else {
            return defaultObj;
        }
    }


    public <T> Object orElseThrow(Exception exception) throws Exception {
        if (!isEmpty() && isPresent()) {
            return this.obT;
        } else throw new Exception(exception);
    }

    public static <T> Obscure<T> of(T obT) {
        return new Obscure<>(obT);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<>(null);
    }


}
