package com.rakovets.course.java.core.practice.concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer(Container.getTerminalCollector());
        Consumer consumerOne = new Consumer("One");
        Consumer consumerTwo = new Consumer("Two");
        Consumer consumerTree = new Consumer("Three");
        Consumer consumerFour = new Consumer("Four");
        Thread producerThread = new Thread(producer, "producer");
        Thread consumerTreadOne= new Thread(consumerOne,"consumer1");
        Thread consumerTreadTwo = new Thread(consumerTwo,"consumer2");
        Thread consumerTreadTree = new Thread(consumerTree,"consumer3");
        Thread consumerTreadFour = new Thread(consumerFour,"consumer4");
        producerThread.start();
        consumerTreadOne.start();
        consumerTreadTwo.start();
        consumerTreadTree.start();
        consumerTreadFour.start();
        producerThread.join();
    }
}

