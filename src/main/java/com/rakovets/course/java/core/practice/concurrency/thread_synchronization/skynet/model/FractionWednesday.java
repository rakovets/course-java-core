package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FactoryThreadService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FractionThreadService;

public class FractionWednesday extends FractionThreadService {

    public FractionWednesday(FactoryThreadService factoryThreadService) {
        super(factoryThreadService);
        fraction = "WEDNESDAY";
    }
}
