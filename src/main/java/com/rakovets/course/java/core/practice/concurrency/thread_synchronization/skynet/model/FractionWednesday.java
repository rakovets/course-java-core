package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FactoryService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FractionService;

public class FractionWednesday extends FractionService {

    public FractionWednesday(FactoryService factoryService) {
        super(factoryService);
        fraction = "WEDNESDAY";
    }
}
