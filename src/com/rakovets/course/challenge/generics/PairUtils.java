package com.rakovets.course.challenge.generics;

public final class PairUtils {
    static <T, K> Pair<K, T> swap(Pair<T, K> pair) {
        return  new Pair<K, T>(pair.getFemale(), pair.getMale());
    }
}