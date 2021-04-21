package com.rakovets.course.java.core.practice.generic_types;

public class Pair<T, V> {
    private T obT;
    private V obV;

    public Pair(T obT, V obV) {
        this.obT = obT;
        this.obV = obV;
    }

    public T getObT() {
        return obT;
    }

    public V getObV() {
        return obV;
    }

    public void setObT(T obT) {
        this.obT = obT;
    }

    public void setObV(V obV) {
        this.obV = obV;
    }

    public static <T, V> Pair swap(Pair<T, V> pair) {
        return new Pair(pair.getObV(), pair.getObT());
    }

    public <T, V> Pair getSwapped() {
        return new Pair(getObV(), getObT());
    }
}
