package com.rakovets.course.javabasics.practice.generics;

import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairUtilTest {


    @Test

    void pairUtilsTest(){
        Pair<Integer, String> pair = new Pair<>(23 , "February");
        PairUtil<Integer, String>  util = new PairUtil<>();
        Pair<String, Integer> swapped = util.swap(pair);
        assertEquals(pair.getK() + pair.getV(), swapped);
    }
}
