package com.rakovets.course.javabasics.practice.concurrency;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class ParallelCalculator {
    public int[] getArrayWithRandom (List<int[]> list) {
        int[] maxElem = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            int max = 1;
            int[] arr = list.get(i);

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            maxElem[i] = max;
        }

        return maxElem;
    }

    public int[] getMaxValuesFromArrayThread (List<int[]> list, int countThread) {
        int[] maxElem = new int[list.size()];

        for (int i = 0; i < list.size(); i+=countThread) {
            List<ParallelCalculator.MyThread> listThreads = new ArrayList<>();

            for (int j = 0; j < countThread; j++) {
                if (i + j < list.size()) {
                    ParallelCalculator.MyThread thread = new ParallelCalculator.MyThread("Nastya-" + j, list.get(i + j));
                    thread.start();

                    listThreads.add(thread);
                }
            }

            for (int k = 0; k < listThreads.size(); k++) {
                try {
                    listThreads.get(k).join();

                    maxElem[i + k] = listThreads.get(k).getMaxValue();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        return maxElem;
    }




    public static class MyThread extends Thread {
        private int value;
        private int[] arr;
        private int maxValue;

        MyThread(String name, int[] arr) {
            super(name);

            this.arr = arr;
        }


        @Override
        public void run () {

            try {
                System.out.printf("%s started... \n", Thread.currentThread().getName());

                int max = 1;

                for (int i : this.arr) {
                    if (i > max) {
                        max = i;
                    }
                }
                sleep(200);

                System.out.printf("%s finished... \n", Thread.currentThread().getName());

                this.maxValue = max;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public int getMaxValue() {
            return this.maxValue;
        }

    }





}
