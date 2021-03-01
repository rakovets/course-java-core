package com.rakovets.course.java.core.practice.concurrency.common;

import java.util.*;

public class ParallelCalculator extends Thread {
    public ArrayList<int[]> list = new ArrayList<>();

    public ParallelCalculator(ArrayList<int[]> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<int[]> results = getArrayAndSum(list);
        for (int[] result : results) {
            System.out.println(Arrays.toString(result));
        }
    }

    public static void getArraySumByThread(ArrayList<int[]> list, int countOfThread) {
        Collection<ArrayList> collection = new ArrayList<>();
        int listSizeByThread = list.size() / countOfThread;
        Iterator listIterator = list.iterator();
        int i = 0;
        while (listIterator.hasNext()) {
            ArrayList<int[]> resultArray = new ArrayList<>();
            for (i = 0; i < listSizeByThread; i++) {
                int[] arr = (int[]) listIterator.next();
                resultArray.add(arr);
            }
            collection.add(resultArray);
            i = 0;
        }
        Iterator collectionIterator = collection.iterator();
        while (collectionIterator.hasNext()) {
            ArrayList<int[]> listByThread = (ArrayList<int[]>) collectionIterator.next();
            Thread ParallelCalculatorThread = new ParallelCalculator(listByThread);
            ParallelCalculatorThread.start();
        }
    }

    public static ArrayList<int[]> getArrayAndSum(ArrayList<int[]> list) {
        ArrayList<int[]> resultArray = new ArrayList<>();
        Iterator listIterator = list.iterator();
        while (listIterator.hasNext()) {
            int[] sum2 = new int[1];
            int sum = 0;
            int[] arr = (int[]) listIterator.next();
            for (int el : arr) {
                sum += el;
            }
            sum2[0] = sum;
            resultArray.add(sum2);
        }
        return resultArray;
    }

}

final class Result {
    private int[] first;
    private int second;

    public Result() {
    }

    public void setFirst(int[] list) {
        this.first = list;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int[] getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
