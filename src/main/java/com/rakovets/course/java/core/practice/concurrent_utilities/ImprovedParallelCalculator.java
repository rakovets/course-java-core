package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.Math.sqrt;
import static java.util.stream.LongStream.rangeClosed;

public class ImprovedParallelCalculator {
    public List<Pair> getArrayAndSum(List<int[]> list) {
        List<Pair> pairs = new ArrayList<>();
        for (int[] array : list) {
            int sum = 0;
            for (Integer number : array) {
                sum += number;
            }
            Pair pair = new Pair();
            pair.setSum(sum);
            pair.setArray(array);
            pairs.add(pair);
        }
        return pairs;
    }

    public List<Pair> test(List<int[]> list, int countThread) {
        List<Pair> pairs = getArrayAndSum(list);
        ForkJoinPool forkJoinPool = null;
        try {
            forkJoinPool = new ForkJoinPool(countThread);
            final List<Integer> list1 = forkJoinPool.submit(() ->
                    IntStream.range(1, 1_000_000).parallel()
                            .filter(ImprovedParallelCalculator::isPrime)
                            .boxed().collect(Collectors.toList())
            ).get();
            System.out.println(list1);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            if (forkJoinPool != null) {
                forkJoinPool.shutdown();
            }
        }
        return pairs;
    }

    public static boolean isPrime(long n) {
        boolean isPrime = n > 1 && rangeClosed(2, (long) sqrt(n)).noneMatch(divisor -> n % divisor == 0);
        if (isPrime) ;
        return isPrime;
    }
}
