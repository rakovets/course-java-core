package com.rakovets.course.java.core.practice.concurrency;

import java.security.KeyStore;
import java.util.*;

public class ParallelCalculatorThreadingDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer[]> array = new LinkedList<>();

      // int count = new Random().nextInt(10);

        for (int i = 0; i <30; i++) {
            Integer[] listik = new Integer[new Random().nextInt(1000000)];
            for (int x = 0; x < listik.length; x++) {
                listik[x] = new Random().nextInt(300);
            }
            array.add(listik);
        }

        System.out.println(array.size());
     //   array.stream()
       //         .forEach(x -> System.out.println(Arrays.toString(x)));
     //   System.out.println("------------------------------------------------------------");
        ParallelCalculatorThreading parallelCalculatorThreading = new ParallelCalculatorThreading();

        Date one = new Date();
        long timeOne = one.getTime();
       // System.out.println(timeOne);
        Map<Integer[], Integer> map = parallelCalculatorThreading.getArraySum(array, 1);
        Date two = new Date();
        long timeTwo = two.getTime();
     //   System.out.println(timeTwo);
        System.out.println("--------------");
        System.out.println(map.size());
        System.out.println("time is " + (timeTwo - timeOne));
      //  for (Map.Entry<Integer[], Integer> map2 : map.entrySet()) {
         //   Integer[] arrayS = map2.getKey();
          //  System.out.println(Arrays.toString(arrayS) + " sum = " + map2.getValue());
    //    }

    }
}
