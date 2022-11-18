package com.rakovets.course.java.core.practice.concurrency_thread_synchronization;

import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.ConsumerThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.ProduceThread;
import com.rakovets.course.java.core.practice.concurrency_thread_synchronization.Producer_Consumer.Store;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        int storeCapacity = 10;
        int threadAmounts = 30;
        int randomBound = 90;
        Random random = new Random(10);
        Queue<Integer> queue = new PriorityQueue<>();

        Store store = new Store(queue, storeCapacity,random);
        ProduceThread produceThread = new ProduceThread(store, threadAmounts, randomBound);
        ConsumerThread consumerThread = new ConsumerThread(store, threadAmounts);

        new Thread(produceThread).start();
        new Thread(consumerThread).start();
    }
}
