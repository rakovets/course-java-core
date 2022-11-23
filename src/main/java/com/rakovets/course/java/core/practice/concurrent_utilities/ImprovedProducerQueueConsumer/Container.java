package com.rakovets.course.java.core.practice.concurrent_utilities.ImprovedProducerQueueConsumer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class Container {
    private final static Logger LOGGER = Logger.getLogger(Container.class.getName());
    private final Queue<Integer> queue = new LinkedList<>();
    ReentrantLock reentrantLock = new ReentrantLock();

    public void add(Integer item) {
        reentrantLock.lock();
        try {
            queue.add(item);
        } finally {
            reentrantLock.unlock();
        }
    }

    public Integer getItem() {
        Integer result;
        try {
            reentrantLock.lock();
            result = queue.poll();
        } catch (Exception e) {
            LOGGER.info("Error");
            result = 0;
        } finally {
            reentrantLock.unlock();
        }
        return result;
    }

    public Queue<Integer> getNumbers() {
        return queue;
    }
}
