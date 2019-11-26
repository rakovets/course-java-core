package com.rakovets.course.challenge.generics.pair;

public final class PairUtil {
    static void swap(Pair<String, String> object) {
        Pair<String, String> swapObject = new Pair(object.getFirst(), object.getSecond());
        object.setFirst(swapObject.getSecond());
        object.setSecond(swapObject.getFirst());
    }
}
