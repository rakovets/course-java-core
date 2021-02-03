package com.rakovets.course.java.core.practice.generic_types;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairTest {

    @Test
    void swap() {
        Pair<Integer, String> pair = new Pair<>(101, "kek");

        Pair<String, Integer> swappedPair = Pair.swap(pair);
        String cheburek = swappedPair.getVar1() + swappedPair.getVar2();

        Assertions.assertEquals("kek101", cheburek);
    }

    @Test
    void getSwapped() {
        Pair<Character, String> pair2 = new Pair<>('F', "Yay");

        Pair<String, Character> charString = pair2.getSwapped();
        String str1 = charString.getVar1() + charString.getVar2();

        Assertions.assertEquals("YayF", str1);
    }
}
