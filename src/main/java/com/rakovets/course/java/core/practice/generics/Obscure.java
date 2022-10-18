package com.rakovets.course.java.core.practice.generics;

public class Obscure<T> {
    private T numberOfAgreement;
    public Obscure() {

    }

    public Obscure(T numberOfAgreement) {
        this.numberOfAgreement = numberOfAgreement;
    }

    public T get() {
        return numberOfAgreement;
    }

    public boolean isPresent() {
        return numberOfAgreement != null;
    }

    public boolean isEmpty() {
        return numberOfAgreement == null;
    }

    public T orElse(T defaultObject) {
        return isPresent() ? numberOfAgreement : defaultObject;
    }

    public T orElseThrow(Exception e) throws Exception {
        if (isPresent()) {
            return numberOfAgreement;
        } else {
            throw e;
        }
    }

    public static <T> Obscure<T> of(T object) {
        return new Obscure<T>(object);
    }

    public static <T> Obscure<T> empty() {
        return new Obscure<T>(null);
    }
}
