package com.rakovets.course.java.core.practice.generics.pair;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K fieldK, V fieldV) {
        this.key = fieldK;
        this.value = fieldV;
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getValue(), this.getKey());
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return pair.getSwapped();
    }

    public K getKey() {
        return key;
    }

    public void setKey(K fieldK) {
        this.key = fieldK;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V fieldValue) {
        this.value = fieldValue;
    }
}
