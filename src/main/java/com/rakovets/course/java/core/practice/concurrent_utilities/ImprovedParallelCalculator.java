package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class ImprovedParallelCalculator {

    public List<ArrayObject> getList(List<int[]> list) {
        ArrayObject arrayObject = new ArrayObject();
        return list.stream()
                .map(e -> {
                    arrayObject.setArray(e);
                    arrayObject.setSum(Arrays.stream(e).sum());
                    return arrayObject;
                })
                .collect(Collectors.toList());
    }

    public List<ArrayObject> getList(List<int[]> list, int amountThreads) {
        ExecutorService executorService = Executors.newFixedThreadPool(amountThreads);

        ArrayObject arrayObject = new ArrayObject();
    }

    public int[] createListOfArray() {
        Random random = new Random();
        return random.ints(1000000, 1, 300).toArray();
    }
}
