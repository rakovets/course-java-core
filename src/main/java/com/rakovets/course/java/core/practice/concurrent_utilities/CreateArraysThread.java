package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.example.generics.model.restrict.A;

import java.util.Random;

public class CreateArraysThread implements Runnable {
    @Override
    public void run() {
        while (true){
        createArray();
    }}

    public void createArray() {
        ArrayObject arrayObject=new ArrayObject();
        Random random = new Random();
        arrayObject.setArray(random.
                ints(1000000, 1, 300).toArray());
    }
}
