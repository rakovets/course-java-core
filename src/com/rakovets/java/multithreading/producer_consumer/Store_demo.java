package com.rakovets.java.multithreading.producer_consumer;


public class Store_demo {
    public static void main(String[] args) {
        Store store = new Store();
        new Thread(new ProducerThread(store), "Producer").start();
        new Thread(new ConsumerThread(store), "Consumer").start();
    }
}
