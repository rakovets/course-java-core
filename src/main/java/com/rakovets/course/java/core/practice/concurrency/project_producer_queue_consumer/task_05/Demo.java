package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_05;

import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_04.MyException;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) throws MyException {
        Queue<Integer> queue = new ArrayDeque<>();
        CommonQueue commonQueue = new CommonQueue(queue);
        ThreadGroup threadGroup = new ThreadGroup("Thread group 1");
        Thread producer = new Producer(threadGroup, "Producer", commonQueue);
        Thread consumer = new Consumer(threadGroup, "Consumer", commonQueue);
        producer.start();
        consumer.start();
    }
}
