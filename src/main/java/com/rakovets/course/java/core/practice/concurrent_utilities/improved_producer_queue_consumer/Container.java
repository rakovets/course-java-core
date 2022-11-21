package com.rakovets.course.java.core.practice.concurrent_utilities.improved_producer_queue_consumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class Container {
    private static final Logger logger = Logger.getLogger(Container.class.getName());
    private final Queue<Integer> queue = new LinkedList<>();
    private ReentrantLock locker = new ReentrantLock();

    public void addItem(Integer item) {
        try {
            locker.lock();
            queue.add(item);
        } finally {
            locker.unlock();
        }
    }

    public Integer getItem() {
        Integer result;
        try {
            locker.lock();
            result = queue.poll();
        } catch (Exception e) {
            logger.severe("Error");
            result = 0;
        } finally {
            locker.unlock();
        }
        return result;
    }
}
