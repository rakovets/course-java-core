package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class CalculateThread implements Callable {
    ArrayList<Integer[]> deltaArrays;

    public CalculateThread(ArrayList<Integer[]> deltaArrays){
        this.deltaArrays = deltaArrays;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        return new ImprovedParallelCalculator().getMaxFromArrays(deltaArrays);
    }
}
