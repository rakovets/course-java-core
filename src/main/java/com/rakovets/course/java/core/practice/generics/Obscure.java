package com.rakovets.course.java.core.practice.generics;

public class Obscure <T>{

    T obscure;
    public Obscure() {
    }
    public Obscure(T obscure) {
        this.obscure = obscure;
    }
    public T get() {
        return obscure;
    }

    boolean isPresent() {
        if (this != null) {
            return true;
        } else return false;
    }

    boolean isEmpty() {
        if (isPresent() && get() != null) {
            return false;
        } else return true;
    }
}
