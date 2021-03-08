package com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.view;

import com.rakovets.course.java.core.practice.concurrency.thread_synchronization.store.service.CustomerService;

public interface StoreView {

    void cashiersServed(CustomerService customerService);

}
