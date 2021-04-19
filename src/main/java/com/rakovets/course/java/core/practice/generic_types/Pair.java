package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K field1;
    private V field2;

    public Pair(K field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public static <K,V> Pair<K,V> swap(Pair<K,V> swap) {
        return new Pair(swap.getField2(), swap.getField1());
    }

    public String getSwapped() {
        return getField1().toString() + " " + getField2().toString();
    }

    public K getField1() {
        return field1;
    }

    public V getField2() {
        return  field2;
    }
}
