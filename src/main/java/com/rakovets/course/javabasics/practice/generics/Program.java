package com.rakovets.course.javabasics.practice.generics;

import org.junit.Test;

public class Program {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(40, "value");
        PairUtil<Integer, String> util = new PairUtil();
        Pair<String, Integer> swaped = util.swap(pair);

        System.out.println(pair);
        System.out.println(swaped);


    }





    }

