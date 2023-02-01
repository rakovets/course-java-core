package com.rakovets.course.java.core.practice.generics.pair;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K fieldK, V fieldV) {
        this.key = fieldK;
        this.value = fieldV;
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getFieldV(), this.getFieldK());
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getFieldV(), pair.getFieldK());
    }

    public K getFieldK() {
        return key;
    }

    public void setFieldK(K fieldK) {
        this.key = fieldK;
    }

    public V getFieldV() {
        return value;
    }

    public void setFieldV(V fieldV) {
        this.value = fieldV;
    }
}
