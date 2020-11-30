package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import com.rakovets.course.javabasics.util.AnsiColorCode;
import com.rakovets.course.javabasics.util.StandardOutputUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class ImprovedParallelCalculator {
    public ArrayList<Integer> getMaxFromArrays(ArrayList<Integer[]> arrays) {
        ArrayList<Integer> maxInArrays = new ArrayList<>();
        Integer maxValue = Integer.MIN_VALUE;
        for (int j = 0; j < arrays.size(); j++) {
            Integer[] array = arrays.get(j);
            for (int i = 0; i < array.length; i++){
                if (maxValue < array[i]){
                    maxValue = array[i];
                }
            }
            maxInArrays.add(maxValue);
        }
        return maxInArrays;
    }
    public ArrayList<Integer[]> generateListOfArrays(int arraysCount) {
        ArrayList<Integer[]> returnedListOfArrays = new ArrayList<>();

        for(int i = 0; i < arraysCount; i++) {
            returnedListOfArrays.add(this.generateArray());
        }
        return returnedListOfArrays;
    }

    public Integer[] generateArray() {

        Integer randLength = new Random().nextInt(10000);
        Integer[] generatedArray = new Integer[randLength];

        this.fillArrayWithRandom(generatedArray);

        return generatedArray;
    }

    public void fillArrayWithRandom(Integer[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(300);
        }
    }
    public void runInParallel (int countOfThread, ArrayList<Integer[]> arrays) throws InterruptedException {
        StandardOutputUtil.printlnWithTime(">>>>>>>>> Method runInParallel(" + countOfThread + ") is started");
        int countArraysInEachThread = (int) (arrays.size() % countOfThread != 0
                ? Math.floor(arrays.size() / countOfThread) + 1
                : arrays.size() / countOfThread);

        ExecutorService service = Executors.newFixedThreadPool(countOfThread);

        List<Callable<ArrayList<Integer>>> threadList = new ArrayList<>();

        for (int i = 0; i < countOfThread; i++) {
            int start = i * countArraysInEachThread;
            int nextIndex = (i + 1) * countArraysInEachThread;
            int end = nextIndex > arrays.size() ? arrays.size() : nextIndex;
            ArrayList<Integer[]> deltaArrays = new ArrayList<>(arrays.subList(start, end));
            threadList.add(new CalculateThread(deltaArrays));
        }

        List<Future<ArrayList<Integer>>> futures = service.invokeAll(threadList);

        for (Future<ArrayList<Integer>> future : futures) {
            try {
                printlnWithTimeAndThread("future.get = " + future.get().toString(), AnsiColorCode.FG_RED_BOLD);
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        service.shutdown();
    }
}
