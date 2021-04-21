package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K k;
    private V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public static <K, V> Pair<K, V> swap(Pair<K, V> pair) {
        return new Pair(pair.getV(), pair.getK());
    }

    public Pair<V,K> getSwapped() {
        return new Pair(this.v, this.k);
    }
}
