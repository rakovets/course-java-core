package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Exchanger;

public class CreateArrays implements Runnable {
    Exchanger<Object> exchanger=new Exchanger<>();
    List<int[]> list = new ArrayList<>();

    @Override
    public void run() {
        list.add(createListOfArray());
        try {
            exchanger.exchange(list);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public int[] createListOfArray() {
        Random random = new Random();
        return random.ints(1000000, 1, 300).toArray();
    }
}
