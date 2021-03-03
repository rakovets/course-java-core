package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet;

public class FractionWorld extends FractionThread {

    public FractionWorld(FactoryThread factoryThread) {
        super(factoryThread);
        fraction = "WORLD";
    }
}
