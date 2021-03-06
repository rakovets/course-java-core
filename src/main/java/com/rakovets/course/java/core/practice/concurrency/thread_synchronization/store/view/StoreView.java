package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.CustomerThreadService;

public interface StoreView {

    void cashiersServed(CustomerThreadService customerThreadService);

}
