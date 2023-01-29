package com.rakovets.course.java.core.practice.generics.pair;

public class Pair<K, V> {
    private K fieldK;
    private V fieldV;

    public Pair(K fieldK, V fieldV) {
        this.fieldK = fieldK;
        this.fieldV = fieldV;
    }

    public Pair<K, V> getSwapped() {
        return null;
    }

    public static <K, V> Pair<K, V> swap(Pair<K, V> pair) {
        return null;
    }

    public K getFieldK() {
        return fieldK;
    }

    public void setFieldK(K fieldK) {
        this.fieldK = fieldK;
    }

    public V getFieldV() {
        return fieldV;
    }

    public void setFieldV(V fieldV) {
        this.fieldV = fieldV;
    }
}
