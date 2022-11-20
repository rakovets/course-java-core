package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class Container {
    private final static Logger logger = Logger.getLogger(Container.class.getName());
    private final Queue<Integer> queue = new LinkedList<>();
    ReentrantLock lock = new ReentrantLock();

    public void addNumber(Integer item) {
        try {
            lock.lock();
            queue.add(item);
        } finally {
            lock.unlock();
        }
    }

    public int getItem() {
        int result;
        try {
            lock.lock();
            result = queue.poll();
        } catch (Exception ex) {
            logger.severe("Error");
            result = 0;
        } finally {
            lock.unlock();
        }
        return result;
    }

    public Queue<Integer> getQueue() {
        return queue;
    }
}
