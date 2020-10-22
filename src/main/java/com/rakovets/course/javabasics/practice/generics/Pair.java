package com.rakovets.course.javabasics.practice.generics;

public class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V vey) {
        this.key = key;
        this.value = vey;
    }

    public K getK() {
        return key;
    }

    public V getV() {
        return value;
    }

    public void  setK(K newK) {
        key = newK;
    }

    public void  setV(V newV) {
        value = newV;
    }

    @Override
    public String toString() {
        return "key=" + this.key +
                "\tvalue=" + this.value + "\n";
    }
}
