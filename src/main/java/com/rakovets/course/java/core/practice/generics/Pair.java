package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    K k;
    V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public Pair getSwapped() {
        return new Pair<>(this.v, this.k);
    }

    public static Pair swap(Pair pair) {
        return pair.getSwapped();
    }

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
       this.v = v;
    }
}
