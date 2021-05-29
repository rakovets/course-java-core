package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.calculator.ImprovedParallelCalculatorThread;

import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Map<Integer[], Long> map;
        Random random = new Random();
        List<Integer[]> arraysList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer[] array = Arrays.stream(new Integer[random.nextInt(1_000_000)])
                    .map(element -> element = random.nextInt(300))
                    .toArray(Integer[]::new);
            arraysList.add(array);
        }
        ExecutorService executor = Executors.newSingleThreadExecutor();
        map = executor.submit(new ImprovedParallelCalculatorThread(arraysList)).get();
        executor.shutdown();
        for (Map.Entry<Integer[], Long> map2 : map.entrySet()) {
            System.out.println(Arrays.toString(map2.getKey()) + " " + map2.getValue());
        }
    }
}
