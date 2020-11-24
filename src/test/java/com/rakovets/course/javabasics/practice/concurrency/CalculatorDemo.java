package com.rakovets.course.javabasics.practice.concurrency;

import com.rakovets.course.javabasics.practice.concurrency.parallelcalculator.Concurrency;

import java.util.LinkedList;


public class CalculatorDemo {
    public static void main(String[] args) {


        LinkedList<int[]> arrayList = Concurrency.getArraysList();
        Concurrency.getMaxElementFromArrayWithThreads(5,arrayList);

       // List<int[]> arrayList = Concurrency.getArraysList();
       // HashMap<String, Integer> resultFromRun;

       // System.out.println(Concurrency.getMaxElementFromArray(arrayList));

      // for (int i = 0; i < 10; i++) {
      //     int lenght = Concurrency.getLenghtForArray(i);
      //     int[] tempArray = new int[lenght];
      //     System.out.println("Lenght = " + lenght);
      //     for (int j = 0; j < tempArray.length; j++) {
      //         int element = Concurrency.getElementForArray(i);
      //         tempArray[i] = element;
      //     }
      //     arrayList.add(tempArray);
      //     System.out.println(arrayList);
      //     tempArray = null;
      // }




    }
}
