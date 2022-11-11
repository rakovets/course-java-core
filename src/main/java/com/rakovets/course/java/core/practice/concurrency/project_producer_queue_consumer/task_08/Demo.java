package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_08;

import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_05.CommonQueue;
import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_05.Producer;
import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_07.Consumer;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) {
        final int NUMBERS_OF_CONSUMERS_THREAD = 3;
        String fileDirName = "C:" + File.separator + "MyDir";
        Queue<Integer> queue = new ArrayDeque<>();
        CommonQueue commonQueue = new CommonQueue(queue);
        ThreadGroup threadGroup = new ThreadGroup("Thread group 1");
        Thread producer = new Producer(threadGroup, "Producer", commonQueue);
        //Thread consumer = new Consumer(threadGroup, "Consumer", commonQueue, fileDirName);
        producer.start();
        for (int i = 1; i <= NUMBERS_OF_CONSUMERS_THREAD; i++) {
            new Consumer(threadGroup, "Consumer " + i, commonQueue, fileDirName).start();
        }
    }
}
