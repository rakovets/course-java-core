package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumThread implements Runnable {
    int[] array;
    List<ArrayObject> list = new ArrayList<>();

    @Override
    public void run() {
        while (true){
     sum();
    }}

    public ArrayObject sum() {
        ArrayObject arrayObject = new ArrayObject();
        arrayObject.setSum(Arrays.stream(arrayObject.getArray()).sum());
        return arrayObject;
    }
}
