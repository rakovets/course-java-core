package com.rakovets.course.java.core.practice.generic_types;

public class Pair <K, V> {
    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public static <K, V> Pair<K, V> swap(K key, V value) {
        return new Pair(value, key);
    }

    public Pair<K,V> getSwapped(){
        return new Pair(this.value, this.key);


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
