package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_03;

import java.util.ArrayDeque;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        Thread producer = new Producer("Producer", queue);
        producer.start();
    }
}
