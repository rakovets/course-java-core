package com.rakovets.course.javabasics.practice.generics;

public final class PairUtil<K, V> {

    public Pair<V,K> swap(Pair<K, V> pair) {
       Pair<V,K> obj1 = new Pair<>(pair.getV(), pair.getK());
        return obj1;

    }
}
