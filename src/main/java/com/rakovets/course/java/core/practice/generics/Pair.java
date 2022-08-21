package com.rakovets.course.java.core.practice.generics;

public class Pair <K, V> {
    private K field1;
    private V field2;

    public Pair(K field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public Pair <K, V> getSwapped() {
        K newField1 = (K) getField2();
        V newField2 = (V) getField1();
       return new Pair<>(newField1, newField2);
    }

    public static <K, V> Pair <K, V> swap(Pair <K, V> pair) {
        return pair.getSwapped();
    }

    public K getField1() {
        return field1;
    }

    public V getField2() {
        return field2;
    }

    public void setField1(K field1) {
        this.field1 = field1;
    }

    public void setField2(V field2) {
        this.field2 = field2;
    }
}
