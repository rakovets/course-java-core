package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumThread implements Runnable {
    int[] array;
    List<ArrayObject> list = new ArrayList<>();

    @Override
    public void run() {
        ArrayObject arrayObject = new ArrayObject();
        arrayObject.setArray(array);
        arrayObject.setSum(Arrays.stream(array).sum());
        list.add(arrayObject);
    }
}
