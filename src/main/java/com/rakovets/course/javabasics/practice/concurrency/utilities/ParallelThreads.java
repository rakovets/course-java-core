package com.rakovets.course.javabasics.practice.concurrency.utilities;

import java.util.concurrent.Callable;

class ParallelThreads implements Callable {
    Integer[] array;

    public ParallelThreads (Integer[] array) {
        this.array = array;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Length: " + array.length);
        Integer sum = 0;
        for(int item : array) {
            sum +=  item;
        } return sum;
    }

}

