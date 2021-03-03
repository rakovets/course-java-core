package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

public class FractionWednesday extends FractionThread {

    public FractionWednesday(FactoryThread factoryThread) {
        super(factoryThread);
        fraction = "WEDNESDAY";
    }
}
