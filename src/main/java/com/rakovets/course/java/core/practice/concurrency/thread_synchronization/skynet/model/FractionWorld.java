package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.model;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FactoryService;
import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.skynet.service.FractionService;

public class FractionWorld extends FractionService {

    public FractionWorld(FactoryService factoryService) {
        super(factoryService);
        fraction = "WORLD";
    }
}
