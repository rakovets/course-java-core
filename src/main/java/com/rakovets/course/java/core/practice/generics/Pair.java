package com.rakovets.course.java.core.practice.generics;

public class Pair <K,V> {
    private K one;
    private V two;

    public Pair(K one, V two) {
        this.one = one;
        this.two = two;
    }

    public Pair<K,V> getSwapped() {
        K oneNew = (K) getTwo();
        V twoNew = (V) getOne();
        setOne(oneNew);
        setTwo(twoNew);
        return this;
    }

    public static <K,V> Pair<K,V> swap(Pair <K,V> pair) {
        return  pair.getSwapped();
    }

    public K getOne() {
        return one;
    }

    public V getTwo() {
        return two;
    }

    public void setOne(K one) {
        this.one = one;
    }

    public void setTwo(V two) {
        this.two = two;
    }
}
