package com.rakovets.course.java.core.practice.generic_types;

public class Pair<K, V> {
    private K field1;
    private V field2;

    public Pair(K field1, V field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    /*public static <K,V> void swap(K field1, V field2) {
        replace = field1;
        field1 = field2;
        field2 = replace;

     }*/

    public K getField1() {
        return field1;
    }

    public V getField2() {
        return  field2;
    }
}
