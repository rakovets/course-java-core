package com.rakovets.course.java.core.practice.generic_types;

import javax.swing.*;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> object) {
        return new Pair<>(object.value, object.key);
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.value, this.key);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
