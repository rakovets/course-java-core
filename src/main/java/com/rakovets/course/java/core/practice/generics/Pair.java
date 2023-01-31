package com.rakovets.course.java.core.practice.generics;

public class Pair <K,V> {
    private K key;
    private V value;

    public Pair(K key,V value) {
        this.key = key;
        this.value = value;
    }

    public Pair<K,V> getSwapped() {
        K keyNew = (K) getValue();
        V valueNew = (V) getKey();
        setKey(keyNew);
        setValue(valueNew);
        return this;
    }

    public static Pair swap (Pair pair){
        return pair.getSwapped();
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
