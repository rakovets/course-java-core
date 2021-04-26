package com.rakovets.course.java.core.practice.generic_types.pair;

public class Pair<K, V> {
    private K tapeFieldK;
    private V tapeFieldV;

    public Pair(K tapeFieldK, V tapeFieldV) {
        this.tapeFieldK = tapeFieldK;
        this.tapeFieldV = tapeFieldV;
    }

    public K getTapeFieldK() {
        return tapeFieldK;
    }

    public V getTapeFieldV() {
        return tapeFieldV;
    }

    public void setTapeFieldK(K tapeFieldK) {
        this.tapeFieldK = tapeFieldK;
    }

    public void setTapeFieldV(V tapeFieldV) {
        this.tapeFieldV = tapeFieldV;
    }

    public static<K, V> Pair<V, K> swap(Pair<K, V> pair) {
        return new Pair(pair.getTapeFieldV(), pair.getTapeFieldK());
    }

    public Pair<V, K> getSwapped() {
        return new Pair(getTapeFieldV(), getTapeFieldK());
    }

}
