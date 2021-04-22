package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K item1;
    private V item2;

    public Pair(K item1, V item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public K getItem1() {
        return item1;
    }

    public V getItem2() {
        return item2;
    }

    public void setItem1(K item1) {
        this.item1 = item1;
    }

    public void setItem2(V item2) {
        this.item2 = item2;
    }

    public static <K, V> Pair<K, V> swap(Pair<K, V> pair) {
        return new Pair(pair.getItem2(), pair.getItem1());
    }

    public Pair<K, V> getSwapped() {
        return new Pair(getItem2(), getItem1());
    }
}
