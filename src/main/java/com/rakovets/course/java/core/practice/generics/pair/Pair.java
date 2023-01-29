package com.rakovets.course.java.core.practice.generics.pair;

public class Pair<K, V> {
    private K fieldK;
    private V fieldV;

    public Pair(K fieldK, V fieldV) {
        this.fieldK = fieldK;
        this.fieldV = fieldV;
    }

    public Pair<V, K> getSwapped() {
        K fieldTmp = fieldK;

        this.setFieldK((K) fieldV);
        this.setFieldV((V) fieldTmp);

        return (Pair<V, K>) this;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getFieldV(), pair.getFieldK());
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
