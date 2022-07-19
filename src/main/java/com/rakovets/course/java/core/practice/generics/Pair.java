package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K firstObject;
    private V secondObject;

    public Pair(K firstObject, V secondObject) {
        this.firstObject = firstObject;
        this.secondObject = secondObject;
    }

    public Pair getSwapped() {
        return new Pair(this.secondObject, this.firstObject);
    }

    public static Pair swap(Pair pair) {
        return pair.getSwapped();
    }

    public K getFirstObject() {
        return firstObject;
    }

    public V getSecondObject() {
        return secondObject;
    }

    public void setFirstObject(K firstObject) {
        this.firstObject = firstObject;
    }

    public void setSecondObject(V secondObject) {
        this.secondObject = secondObject;
    }
}
