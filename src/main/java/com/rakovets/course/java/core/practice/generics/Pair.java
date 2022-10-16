package com.rakovets.course.java.core.practice.generics;

public class Pair<K, V> {
    private K k;
    private V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    /**
     * The method returns the current "Pair" where the elements of the pair are swapped.
     *
     * @return current "Pair", where the elements of the pair are swapped
     */
    public Pair getSwapped() {
        return new Pair<>(this.v, this.k);
    }

    /**
     * The method takes a parameter "Pair" and returns "Pair", where the values in the pair are swapped.
     *
     * @param pair entry argument in the form of generic type
     * @return "Pair", where the values in the pair are swapped
     */
    public static Pair swap(Pair pair) {
        return pair.getSwapped();
    }

    @Override
    public String toString() {
        return "" + getK() + ", " + getV() + "";
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
}
