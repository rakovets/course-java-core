package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.ground;

import com.rakovets.course.javabasics.util.AnsiColorCode;

import java.util.ArrayList;
import java.util.concurrent.Callable;

import static com.rakovets.course.javabasics.util.StandardOutputUtil.printlnWithTimeAndThread;

public class CalculateThread implements Callable {
    ArrayList<Integer[]> deltaArrays;

    public CalculateThread(ArrayList<Integer[]> deltaArrays){
        this.deltaArrays = deltaArrays;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        printlnWithTimeAndThread("thread works", AnsiColorCode.FG_MAGENTA);
        return new ImprovedParallelCalculator().getMaxFromArrays(deltaArrays);

    }
}
