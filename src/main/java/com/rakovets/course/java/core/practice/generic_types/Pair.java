package com.rakovets.course.java.core.practice.generic_types;

public class Pair <K, V> {
    private K firstField;
    private V secondField;

    public Pair(K firstField, V secondField) {
        this.firstField = firstField;
        this.secondField = secondField;
    }

    public static <K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair<> (pair.getSecondField(), pair.getFirstField());
    }

    public Pair<V, K> getSwapped() {
        return new Pair<> (this.getSecondField(), this.getFirstField());
    }

    public K getFirstField() {
        return firstField;
    }

    public V getSecondField() {
        return secondField;
    }

    public void setFirstField(K firstField) {
        this.firstField = firstField;
    }

    public void setSecondField(V secondField) {
        this.secondField = secondField;
    }
}
