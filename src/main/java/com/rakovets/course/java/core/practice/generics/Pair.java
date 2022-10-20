package com.rakovets.course.java.core.practice.generics;

public class Pair <K, V >{
    private K k;
    private V v;

    public Pair (K k, V v) {
        this.k = k;
        this.v = v;
    }

    public Pair<V, K> getSwapped() {
        return  new Pair<>(this.getV(), this.getK());
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair){
        return new Pair<>(pair.v, pair.k);
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

    public void setV (V v) {
        this.v = v;
    }
}
