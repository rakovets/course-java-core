package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class QueueContainer {
    private final static Logger logger = Logger.getLogger(QueueContainer.class.getName());
    private final Queue<Integer> queue = new LinkedList<>();
    ReentrantLock lock = new ReentrantLock();

    public void addItem(Integer item) {
        try {
            lock.lock();
            queue.add(item);
        } finally {
            lock.unlock();
        }
    }

    public Optional<Integer> getItem() {
        Optional<Integer> result;
        try {
            lock.lock();
            result = Optional.ofNullable(queue.poll());
        } catch (Exception ex) {
            logger.severe("Error");
            result = Optional.empty();
        } finally {
            lock.unlock();
        }
        return result;
    }
}
