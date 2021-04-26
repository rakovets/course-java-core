package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<V, K> swap(Pair<K,V> swap) {
        return new Pair<>(swap.getValue(), swap.getKey());
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(value, key);
    }

    @Override
    public String toString() {
        return key + " " + value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return  value;
    }
}
