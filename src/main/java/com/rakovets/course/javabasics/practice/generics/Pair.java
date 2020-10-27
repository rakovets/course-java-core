package com.rakovets.course.javabasics.practice.generics;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "key=" + this.key +
                "\tvalue=" + this.value;
    }

    public K getK() {
        return key;
    }

    public V getV() {
        return value;
    }

    public void setK(K newK) {
        key = newK;
    }

    public void setV(V newV) {
        value = newV;
    }


}
