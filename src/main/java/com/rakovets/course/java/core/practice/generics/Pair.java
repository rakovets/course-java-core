package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K firstType;
    private V secondType;

    public Pair(K firstType, V secondType) {
        this.firstType = firstType;
        this.secondType = secondType;
    }

    public Pair<V, K> getSwapped() {
        return new Pair<>(this.getSecondType(), this.getFirstType());
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<>(pair.getSecondType(), pair.getFirstType());
    }

    public K getFirstType() {
        return this.firstType;
    }

    public void setFirstType(K firstType) {
        this.firstType = firstType;
    }

    public V getSecondType() {
        return this.secondType;
    }

    public void setSecondType(V secondType) {
        this.secondType = secondType;
    }
}
