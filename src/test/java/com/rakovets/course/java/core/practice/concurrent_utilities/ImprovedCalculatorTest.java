//package com.rakovets.course.java.core.practice.concurrent_utilities;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//import java.util.concurrent.TimeUnit;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class ImprovedCalculatorTest {
//    ImprovedParallelCalculator calculator;
//    List<int[]> intArrayList = Arrays.asList(new int[]{ 1, 2, 3 });
//    @Test
//    public void testCounter() throws InterruptedException {
//        int amountThread = 1;
//        new ImprovedParallelCalculator(amountThread);
//        for (int i = 0; i < 500; i++) {
//            System.out.println(calculator.calculate(intArrayList));
//        }
//        Assertions.assertEquals(500, calculator.calculate(intArrayList));
//    }
//
//    @Test
//    public void testCounterWithConcurrency() throws InterruptedException {
//        int amountThread = 1;
//        new ImprovedParallelCalculator(amountThread);
//        ExecutorService es = Executors.newFixedThreadPool(1);
//        for (int i = 0; i < 10; i++) {
//            es.execute(() -> {
//                try {
//                    System.out.println(calculator.calculate(intArrayList));
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//        }
//
//        es.shutdown();
//        es.awaitTermination(1, TimeUnit.MINUTES);
//        Assertions.assertEquals(11, calculator.calculate(intArrayList));
//    }
//
//    @Test
//    void testImprovedCalculator() throws InterruptedException {
//        int amountThread = 1;
//        new ImprovedParallelCalculator(amountThread);
//        Map<int[], Integer> map = calculator.calculate(calculator.createListOfArrays
//                (5, 1000, 1, 300));
//
//        map.forEach((key, value) ->
//                Assertions.assertEquals(Arrays.stream(key).sum(), value));
//    }
//}
//
