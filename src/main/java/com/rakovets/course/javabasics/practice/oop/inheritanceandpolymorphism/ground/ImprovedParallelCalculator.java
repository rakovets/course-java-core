package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import java.util.ArrayList;
import java.util.Random;

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
}
