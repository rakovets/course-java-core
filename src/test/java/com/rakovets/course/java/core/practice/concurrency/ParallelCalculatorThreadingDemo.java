package com.rakovets.course.java.core.practice.concurrency;

import javax.xml.crypto.Data;
import java.security.KeyStore;
import java.util.*;

public class ParallelCalculatorThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer[]> array = new LinkedList<>();

        //   int count = new Random().nextInt(1000);

        for (int i = 0; i < 50; i++) {
            Integer[] listik = new Integer[1000000];
            // Integer[] listik = new Integer[new Random().nextInt(100)];
            for (int x = 0; x < listik.length; x++) {
                listik[x] = new Random().nextInt(300);
            }
            array.add(listik);
        }

        System.out.println(array.size());
        //  array.stream()
        //      .forEach(x -> System.out.println(Arrays.toString(x)));
        System.out.println("------------------------------------------------------------");
        ParallelCalculatorThreading parallelCalculatorThreading = new ParallelCalculatorThreading();
        long after = System.currentTimeMillis();

        Map<Integer[], Integer> map = parallelCalculatorThreading.getArraySum(array, 3);

        long before = System.currentTimeMillis();

        System.out.println("--------------");


       // for (Map.Entry<Integer[], Integer> map2 : map.entrySet()) {
        //    Integer[] arrayS = map2.getKey();
          //  System.out.println(Arrays.toString(arrayS) + " sum = " + map2.getValue());
      //  }
        System.out.println("Size = " + map.size());
        System.out.println("Time is = " + (before - after));
    }
}
