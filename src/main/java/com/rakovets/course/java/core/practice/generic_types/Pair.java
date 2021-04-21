package com.rakovets.course.java.core.practice.generic_types;

public class Pair <K, V> {
    private K fieldK;
    private V fieldV;

    public Pair (K fieldK, V fieldV) {
        this.fieldK = fieldK;
        this.fieldV = fieldV;
    }

    public K getFieldK() {
        return fieldK;
    }

    public V getFieldV() {
        return fieldV;
    }

    public void setFieldK(K fieldK) {
        this.fieldK = fieldK;
    }

    public void setFieldV(V fieldV) {
        this.fieldV = fieldV;
    }

    public static <K, V> Pair <V,K> swap(Pair<K, V> pair) {
        return new Pair(pair.getFieldV(), pair.getFieldK());
    }

    public <V, K> Pair <V, K> getSwapped() {
        return new Pair(getFieldV(), getFieldK());
    }






}
