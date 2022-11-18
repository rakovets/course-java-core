package com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Container extends ConcurrentLinkedQueue<Integer> {
    public ConcurrentLinkedQueue<Integer> container = new ConcurrentLinkedQueue<>();
}
