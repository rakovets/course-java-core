package com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_07;

import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_04.MyException;
import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_05.CommonQueue;
import com.rakovets.course.java.core.practice.concurrency.project_producer_queue_consumer.task_05.Producer;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Queue;

public class Demo {
    public static void main(String[] args) throws MyException {
        String fileDirName = "C:" + File.separator + "MyDir";
        Queue<Integer> queue = new ArrayDeque<>();
        CommonQueue commonQueue = new CommonQueue(queue);
        ThreadGroup threadGroup = new ThreadGroup("Thread group 1");
        Thread producer = new Producer(threadGroup, "Producer", commonQueue);
        Thread consumer = new Consumer(threadGroup, "Consumer", commonQueue, fileDirName);
        producer.start();
        consumer.start();
    }
}
