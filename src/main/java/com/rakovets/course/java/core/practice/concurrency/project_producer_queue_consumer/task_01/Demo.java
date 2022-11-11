package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_01;

public class Demo {
    public static void main(String[] args) {
        Thread producer = new Producer("Producer");
        producer.start();
    }
}
